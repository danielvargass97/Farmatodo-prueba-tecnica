package com.farmatodo.technical.presentation.controllers;

import com.farmatodo.technical.domain.model.HappyNumber;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/happynumber")
public class HappyNumberController {

    @PostMapping("/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HappyNumber> getHappyNumbersByList(
            @Valid @RequestBody  request
    ){

    }

}
