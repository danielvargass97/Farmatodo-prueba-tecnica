package com.farmatodo.technical.presentation.controllers;

import com.farmatodo.technical.bussines.services.HappyNumberService;
import com.farmatodo.technical.domain.model.HappyNumber;
import com.farmatodo.technical.domain.request.HappyNumberRequest;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    HappyNumberService happyNumberService;

    @PostMapping(value = "/list", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HappyNumber> getHappyNumbersByList(
            @Valid @RequestBody HappyNumberRequest happyNumberRequest
    ) {
        return ResponseEntity.ok(happyNumberService.getHappyNumbersByList(happyNumberRequest.getNumbers()));
    }

}
