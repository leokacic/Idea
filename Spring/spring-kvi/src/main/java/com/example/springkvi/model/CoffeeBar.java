package com.example.springkvi.model;

import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class CoffeeBar {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne()
    @JoinColumn(name="id",referencedColumnName = "id", insertable=false, updatable=false)
    private Town town;
    private String name;

}
