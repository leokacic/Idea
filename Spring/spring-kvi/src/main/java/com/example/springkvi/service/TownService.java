package com.example.springkvi.service;

import com.example.springkvi.model.CoffeeBar;
import com.example.springkvi.model.Town;
import com.example.springkvi.repository.CoffeeBarRepository;
import com.example.springkvi.repository.TownRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.*;

@Service
public class TownService {

    List<Town> allTowns = new ArrayList<>();

    @Autowired
    TownRepository townRepository;

    @Autowired
    CoffeeBarRepository coffeeBarRepository;

    public List<Town> getAllTowns(){
        return allTowns;
    }

    @PostConstruct
    public void getData() throws IOException, ParseException {

        try {
        URL url = new URL("https://tehcon.com.hr/api/CroatiaTownAPI/list.php?v=1&entityType=2");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        String inline = "";

        if(responsecode != 200){
            throw new RuntimeException("HttpResponseCode: " + responsecode);
        } else {
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                 inline += sc.nextLine();
            }
            sc.close();
        }

        JSONParser parse = new JSONParser();
        JSONObject jobj = (JSONObject)parse.parse(inline);
        JSONArray jsonarr_1 = (JSONArray) jobj.get("towns");

        for(int i=0;i<jsonarr_1.size();i++)
        {
            JSONObject jsonobj_1 = (JSONObject)jsonarr_1.get(i);

            Town town = new Town();
            town.setId((Long)jsonobj_1.get("ID"));
            town.setName((String)jsonobj_1.get("name"));
            town.setCountyId((Long)jsonobj_1.get("countyID"));
            town.setCountyName((String)jsonobj_1.get("countyName"));
            townRepository.save(town);
            allTowns.add(town);
        }
        conn.disconnect();
        }
            catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public Town findById(Long id) throws Exception {

        Optional<Town> town = townRepository.findById(id);
        if(town.isPresent()){
            return town.get();
        } else {
            throw new Exception("Element not found");
        }
    }

    public void saveCoffeeBar(CoffeeBar coffeeBar) {
        coffeeBarRepository.save(coffeeBar);
    }
}
