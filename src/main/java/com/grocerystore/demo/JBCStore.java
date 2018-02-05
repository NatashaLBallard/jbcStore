package com.grocerystore.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JBCStore {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    //GETTERS & SETTERS for JBCStore
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
