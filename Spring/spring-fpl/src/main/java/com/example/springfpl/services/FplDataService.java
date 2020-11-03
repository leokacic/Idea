package com.example.springfpl.services;

import com.example.springfpl.models.FplStats;
import com.example.springfpl.models.FplTeam;
import com.example.springfpl.repositories.FplRepository;
import com.example.springfpl.repositories.TeamRepository;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class FplDataService {

    @Autowired
    FplRepository fplRepository;

    @Autowired
    TeamRepository teamRepository;


    FplTeam fplTeam = new FplTeam();

    public static int size=0;

    public int getSize(){
        return size;
    }

    private List<FplStats> allStats = new ArrayList<>();

    public List<FplStats> getAllStats () {
        return allStats;
    }

    public List<FplStats> getAllStatsSorted (List<FplStats>allStats, String sortMethod) {
        switch(sortMethod) {
            case "Name":
                allStats.sort(Comparator.comparing(FplStats::getName));
                break;
            case "TeamName":
                allStats.sort(Comparator.comparing(FplStats::getTeamName));
                break;
            case "TotalPoints":
                allStats.sort(Comparator.comparing(FplStats::getTotalPoints).reversed());
                break;
            case "Minutes":
                allStats.sort(Comparator.comparing(FplStats::getMinutes).reversed());
                break;
            default:
                return allStats;
        }
        return allStats;
    }

    @PostConstruct
    public void fetchFplData() throws IOException {
        String csvFile = "/home/kacicleo/Desktop/Spring/spring-fpl/src/main/resources/static/fplAnalytics-playerStatusData.csv";
        List<FplStats> newStats = new ArrayList<>();

        String temp="ARS";
        Integer sizeOfPlayers = 1;
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(br);
        for (CSVRecord record : records) {
            FplStats fplStats = new FplStats();

            if (!record.get("team").equals(temp)) {
                sizeOfPlayers = 1;
            }

            fplTeam.setTeamName(record.get("team"));
            fplTeam.setNumberOfPLayers(sizeOfPlayers++);
            teamRepository.save(fplTeam);
            temp = record.get("team");
                fplStats.setName(record.get("name"));
                fplStats.setTeamName(record.get("team"));
                fplStats.setStatus(record.get("status"));
                fplStats.setPosition(record.get("position"));
                fplStats.setBonus(Integer.parseInt(record.get("bonus")));
                fplStats.setCost(Float.parseFloat(record.get("cost")));
                fplStats.setMinutes(Integer.parseInt(record.get("minutes")));
                fplStats.setTotalPoints(Integer.parseInt(record.get("total_points")));
                fplStats.setPointsPerGame(Float.parseFloat(record.get("points_per_game")));
                fplStats.setSelectedByPercent(Float.parseFloat(record.get("selected_by_percent")));
                 if(!(record.get("minutes").equals(null))){
                     if(Integer.parseInt(record.get("minutes")) > 1000)
                     fplStats.setSize(size++);
                 }
                 fplRepository.save(fplStats);
                newStats.add(fplStats);
        }
        this.allStats = newStats;
    }
}