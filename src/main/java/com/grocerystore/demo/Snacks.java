package com.grocerystore.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Snacks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long snackId;

    @NotNull
    @Size(min=2)
    private String snackName;

    @NotNull
    @Size(min = 2)
    private String snackCrunchiness;

    @NotNull
    @Size(min = 2)
    private Double snackPrice;




    //GETTERS & SETTERS for Snacks

    public long getSnackId() {
        return snackId;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public void setSnackId(long snackId) {
        this.snackId = snackId;
    }

    public String getSnackCrunchiness() {
        return snackCrunchiness;
    }

    public void setSnackCrunchiness(String snackCrunchiness) {
        this.snackCrunchiness = snackCrunchiness;
    }

    public Double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(Double snackPrice) {
        this.snackPrice = snackPrice;
    }



}
