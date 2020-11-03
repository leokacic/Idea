package com.example.springtestna.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Players {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String totalPoints;
    private String cost;
}
