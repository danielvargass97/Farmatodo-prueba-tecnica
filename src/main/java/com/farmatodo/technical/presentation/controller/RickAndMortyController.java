package com.farmatodo.technical.presentation.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "Rick and Morty Controller")
@RequestMapping("/technical/test/rickandmorty")
public class RickAndMortyController {

    @ApiOperation(value = "Get episode description by episode id")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Episode description obtained"),
            @ApiResponse(code = 400, message = "Error in input data."),
            @ApiResponse(code = 401, message = "Access denied."),
            @ApiResponse(code = 403, message = "Error in query ."),
            @ApiResponse(code = 500, message = "Internal Error.")})
    @GetMapping(path = "/{episodeId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> getEpisodeDescriptionByEpisodeId(
        @ApiParam(value = "Episode id", required = true) @PathVariable("episodeId") String episodeId) throws Exception {

    }

}
