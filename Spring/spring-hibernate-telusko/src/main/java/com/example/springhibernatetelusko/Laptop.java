package com.example.springhibernatetelusko;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop{

    @Id
    private int lId;
    private String lName;

    public Laptop() {
    }

    public Laptop(int lId, String lName) {
        this.lId = lId;
        this.lName = lName;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
