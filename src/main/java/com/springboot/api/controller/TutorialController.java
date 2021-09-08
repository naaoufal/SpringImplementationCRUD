package com.springboot.api.controller;

import com.springboot.api.model.ModelTuto;
import com.springboot.api.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class TutorialController {

    @Autowired
    TutorialRepository tutorialRepository;

    @GetMapping("/tutorials")
    public ResponseEntity<List<ModelTuto>> getAllTutorials(@RequestParam(required = false) String title) {
        try {

            List<ModelTuto> tutorials = new ArrayList<ModelTuto>();

            tutorialRepository.findAll();

            return new ResponseEntity<>(tutorials, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/addData")
    public ResponseEntity<ModelTuto> addData(@RequestBody ModelTuto tutorial) {
        try {
            ModelTuto _tutorial = tutorialRepository.save(new ModelTuto(
                    tutorial.getTitle(), tutorial.getDesc()));
            return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
