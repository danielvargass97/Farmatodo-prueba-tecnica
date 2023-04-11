package com.farmatodo.technical.presentation.controllers;

import com.farmatodo.technical.bussines.services.RickAndMortyService;
import com.farmatodo.technical.domain.model.Episode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/rickandmorty")
public class RickAndMortyController {

    @Autowired
    RickAndMortyService rickAndMortyService;

    @GetMapping("/{episodeId}")
    public ResponseEntity<Episode> getEpisodeDescriptionByEpisodeId(@PathVariable("episodeId") String episodeId) throws IOException {
        Episode episode = rickAndMortyService.getEpisodeById(episodeId);
        return ResponseEntity.ok(episode);
    }

}
