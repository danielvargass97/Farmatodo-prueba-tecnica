package com.farmatodo.technical.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "characters")
public class Character {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "species")
    private String species;
    @Column(name = "gender")
    private String gender;
    @Column(name = "image")
    private String image;
    @Transient
    private Location location;
    @Column(name = "location_id")
    private int locationId;


    public Character() {

    }

    public Character(int id, String name, String species, String gender, String image, Location location) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.image = image;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

}
