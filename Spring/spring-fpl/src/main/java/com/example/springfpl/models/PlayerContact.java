package com.example.springfpl.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PlayerContact {

    @Id
    private String name;
    private Integer contact;

    @OneToOne
    @JoinColumn(name = "name", referencedColumnName = "name")
    private FplStats fplStats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public FplStats getFplStats() {
        return fplStats;
    }

    public void setFplStats(FplStats fplStats) {
        this.fplStats = fplStats;
    }
}
