package com.example.springkvi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Town {
    @Id
    private Long id;
    private String name;
    private Long countyId;
    private String countyName;
}
