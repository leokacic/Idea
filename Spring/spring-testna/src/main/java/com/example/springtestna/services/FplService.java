package com.example.springtestna.services;

import com.example.springtestna.models.Players;
import com.example.springtestna.repository.FplRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

@Service
public class FplService {

    @Autowired
    FplRepository fplRepository;

    public List<Players> allPlayers;
    public Players player;

    public List<Players> getAllPlayers() {
        return allPlayers;
    }

    public List<Players> getFromCSV() throws IOException {

        Reader in = new FileReader("~/Desktop/Spring/spring-testna/src/main/resources/static/fplAnalytics-playerStautsData.csv");
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
        for (CSVRecord record : records) {
            player.setName(record.get("name"));
            player.setCost(record.get("cost"));
            player.setTotalPoints(record.get("total_points"));
            allPlayers.add(player);
        }
        return allPlayers;
    }
}
