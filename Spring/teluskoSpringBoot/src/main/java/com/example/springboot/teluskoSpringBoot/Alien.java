package com.example.springboot.teluskoSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aId;
    private String aTech;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaTech() {
        return aTech;
    }

    public void setaTech(String aTech) {
        this.aTech = aTech;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    private String aName;

    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aTech='" + aTech + '\'' +
                ", aName='" + aName + '\'' +
                '}';
    }
}
