package com.example.springfpl.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FplStats {

    @Id
    private String name;
    private String teamName;
    private String position;
    private String status;
    private Float cost;
    private int minutes;
    private int totalPoints;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Float getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Float pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Float getSelectedByPercent() {
        return selectedByPercent;
    }

    public void setSelectedByPercent(Float selectedByPercent) {
        this.selectedByPercent = selectedByPercent;
    }

    private int bonus;
    private Float pointsPerGame;
    private Float selectedByPercent;



    @Override
    public String toString() {
        return "FplStats{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", position='" + position + '\'' +
                ", cost='" + cost + '\'' +
                ", status='" + status + '\'' +
                ", minutes=" + minutes +
                ", totalPoints=" + totalPoints +
                ", bonus=" + bonus +
                ", pointsPerGame=" + pointsPerGame +
                ", selectedByPercent=" + selectedByPercent +
                '}';
    }
}
