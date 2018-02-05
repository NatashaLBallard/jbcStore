package com.grocerystore.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CleaningItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cleaningId;

    @NotNull
    @Size(min=2)
    private String cleaningName;

    @NotNull
    @Size(min = 2)
    private String cleaningStrength;

    @NotNull
    @Size(min = 2)
    private Double cleaningPrice;




    //GETTERS & SETTERS for Cleaning Items

    public String getCleaningName() {
        return cleaningName;
    }

    public void setCleaningName(String cleaningName) {
        this.cleaningName = cleaningName;
    }

    public long getCleaningId() {
        return cleaningId;
    }

    public void setCleaningId(long cleaningId) {
        this.cleaningId = cleaningId;
    }

    public String getCleaningStrength() {
        return cleaningStrength;
    }

    public void setCleaningStrength(String cleaningStrength) {
        this.cleaningStrength = cleaningStrength;
    }

    public Double getCleaningPrice() {
        return cleaningPrice;
    }

    public void setCleaningPrice(Double cleaningPrice) {
        this.cleaningPrice = cleaningPrice;
    }


}
