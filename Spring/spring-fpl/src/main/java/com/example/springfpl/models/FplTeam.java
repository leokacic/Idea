package com.example.springfpl.models;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class FplTeam {

    @Id
    private String teamName;
    private Integer numberOfPLayers;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getNumberOfPLayers() {
        return numberOfPLayers;
    }

    public void setNumberOfPLayers(Integer numberOfPLayers) {
        this.numberOfPLayers = numberOfPLayers;
    }

    public List<FplStats> getFplStats() {
        return fplStats;
    }

    public void setFplStats(List<FplStats> fplStats) {
        this.fplStats = fplStats;
    }

    @OneToMany
    @JoinColumn(name = "teamName",referencedColumnName = "teamName")
    private List<FplStats> fplStats;
}
