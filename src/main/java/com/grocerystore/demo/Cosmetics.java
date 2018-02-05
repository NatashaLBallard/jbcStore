package com.grocerystore.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Cosmetics {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long cosmeticId;


        @NotNull
        @Size(min=2)
        private String cosmeticName;

        @NotNull
        @Size(min=2)
        private String cosmeticBrand;

        @NotNull
        @Size(min=2)
        private String cosmeticPrice;

        @NotNull
        @Size(min=2)
        private String cosmeticPopularity;




        //GETTERS & SETTERS for Cosmetics

        public long getCosmeticId() {
            return cosmeticId;
        }

        public void setCosmeticId(long cosmeticId) {
            this.cosmeticId = cosmeticId;
        }//GETTERS & SETTERS for

        public String getCosmeticName() {
            return cosmeticName;
        }

        public void setCosmeticName(String cosmeticName) {
            this.cosmeticName = cosmeticName;
        }

        public String getCosmeticBrand() {
            return cosmeticBrand;
        }

        public void setCosmeticBrand(String cosmeticBrand) {
            this.cosmeticBrand = cosmeticBrand;
        }

        public String getCosmeticPrice() {
            return cosmeticPrice;
        }

        public void setCosmeticPrice(String cosmeticPrice) {
            this.cosmeticPrice = cosmeticPrice;
        }

        public String getCosmeticPopularity() {
            return cosmeticPopularity;
        }

        public void setCosmeticPopularity(String cosmeticPopularity) {
            this.cosmeticPopularity = cosmeticPopularity;
        }

    }

