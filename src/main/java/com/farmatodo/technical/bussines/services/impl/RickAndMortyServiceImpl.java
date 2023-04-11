package com.farmatodo.technical.bussines.services.impl;

import com.farmatodo.technical.bussines.services.RickAndMortyService;
import com.farmatodo.technical.domain.model.Character;
import com.farmatodo.technical.domain.model.Episode;
import com.farmatodo.technical.domain.model.Location;
import com.farmatodo.technical.domain.response.CharacterResponse;
import com.farmatodo.technical.domain.response.EpisodeResponse;
import com.farmatodo.technical.domain.response.LocationResponse;
import com.farmatodo.technical.infrastructure.clients.ApiClient;
import com.farmatodo.technical.infrastructure.repositories.CharacterRepository;
import com.farmatodo.technical.infrastructure.repositories.EpisodeRepository;
import com.farmatodo.technical.infrastructure.repositories.LocationRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class RickAndMortyServiceImpl implements RickAndMortyService {

    private final ApiClient apiClient;
    private final EpisodeRepository episodeRepository;
    private final CharacterRepository characterRepository;
    private final LocationRepository locationRepository;

    @Autowired
    public RickAndMortyServiceImpl(ApiClient apiClient, EpisodeRepository episodeRepository,
                                   CharacterRepository characterRepository, LocationRepository locationRepository) {
        this.apiClient = apiClient;
        this.episodeRepository = episodeRepository;
        this.characterRepository = characterRepository;
        this.locationRepository = locationRepository;

    }

    @Override
    public Episode getEpisodeById(String episodeId) throws IOException {
        String response = apiClient.get("https://rickandmortyapi.com/api/episode/" + episodeId);
        Gson gson = new Gson();
        EpisodeResponse episodeResponse = gson.fromJson(response, EpisodeResponse.class);
        Episode episode = setEpisodeData(episodeResponse);
        episodeRepository.save(episode);
        return episode;
    }

    @Override
    public Character getCharacterByUrl(String characterUrl) throws IOException {
        String response = apiClient.get(characterUrl);
        Gson gson = new Gson();
        CharacterResponse characterResponse = gson.fromJson(response, CharacterResponse.class);
        Character character = setCharacterData(characterResponse);
        characterRepository.save(character);
        return character;
    }

    @Override
    public Location getLocationByUrl(String locationUrl) throws IOException {
        String response = apiClient.get(locationUrl);
        Gson gson = new Gson();
        LocationResponse locationResponse = gson.fromJson(response, LocationResponse.class);
        Location location = setLocationData(locationResponse);
        locationRepository.save(location);
        return location;
    }

    private Episode setEpisodeData(EpisodeResponse episodeResponse) throws IOException {
        Episode episode = new Episode();
        episode.setId(episodeResponse.getId());
        episode.setName(episodeResponse.getName());
        List<Character> characters = new ArrayList<>();
        for (String characterUrl : episodeResponse.getCharacters()) {
            characters.add(getCharacterByUrl(characterUrl));
        }
        episode.setCharacters(characters);
        return episode;
    }

    private Character setCharacterData(CharacterResponse characterResponse) throws IOException {
        Character character = new Character();
        character.setId(characterResponse.getId());
        character.setName(characterResponse.getName());
        character.setSpecies(characterResponse.getSpecies());
        character.setGender(characterResponse.getGender());
        character.setImage(characterResponse.getImage());
        if (Objects.equals(characterResponse.getLocation().getName(), "unknown")) {
            character.setLocation(new Location(9999, "Unknown", "", ""));
            character.setLocationId(9999);
        } else {
            Location location = getLocationByUrl(characterResponse.getLocation().getUrl());
            character.setLocation(location);
            character.setLocationId(location.getId());
        }
        return character;
    }

    private Location setLocationData(LocationResponse locationResponse) {
        Location location = new Location();
        location.setId(locationResponse.getId());
        location.setName(locationResponse.getName());
        location.setType(locationResponse.getType());
        location.setDimension(locationResponse.getDimension());
        return location;
    }

}
