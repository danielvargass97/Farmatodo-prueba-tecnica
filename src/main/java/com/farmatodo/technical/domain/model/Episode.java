package com.farmatodo.technical.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episodes", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class Episode {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(name = "episode_character",
            joinColumns = @JoinColumn(name = "episode_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id"))
    private List<Character> characters;

    public Episode() {
    }

    public Episode(int id, String name, List<Character> characters) {
        this.id = id;
        this.name = name;
        this.characters = characters;
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

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
