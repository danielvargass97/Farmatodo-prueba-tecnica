package com.farmatodo.technical.presentation.controllers;

import com.farmatodo.technical.bussines.services.AdditionNumberService;
import com.farmatodo.technical.domain.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/addition")
public class AdditionNumberController {

    @Autowired
    AdditionNumberService additionNumberService;

    @GetMapping("/{n}")
    public ResponseEntity<Result> getEpisodeDescriptionByEpisodeId(@PathVariable("n") int n) throws IOException {
        return ResponseEntity.ok(additionNumberService.sumNumbersSinceOneToN(n));
    }
}
