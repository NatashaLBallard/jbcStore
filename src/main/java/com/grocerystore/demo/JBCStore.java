package com.grocerystore.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JBCStore {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String jbcStoreListName;


    //GETTERS & SETTERS for JBCStore
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJbcStoreListName() {
        return jbcStoreListName;
    }

    public void setJbcStoreListName(String jbcStoreListName) {
        this.jbcStoreListName = jbcStoreListName;
    }
}
