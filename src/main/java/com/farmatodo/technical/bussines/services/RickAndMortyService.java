package com.farmatodo.technical.bussines.services;

import com.farmatodo.technical.domain.model.Character;
import com.farmatodo.technical.domain.model.Episode;
import com.farmatodo.technical.domain.model.Location;

import java.io.IOException;

public interface RickAndMortyService {

    Episode getEpisodeById(String episodeId) throws IOException;

    Character getCharacterByUrl(String characterUrl) throws IOException;

    Location getLocationByUrl(String locationUrl) throws IOException;
}
