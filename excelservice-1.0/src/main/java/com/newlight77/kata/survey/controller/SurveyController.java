package com.newlight77.kata.survey.controller;

import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.SurveyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    private final SurveyService surveyService;

    public SurveyController(final SurveyService surveyService) {
      this.surveyService = surveyService;
    }

    @PostMapping
    public void createSurvey(@RequestBody final Survey survey) {
        surveyService.createSurvey(survey);
    }

    @GetMapping("/{id}")
    public Survey getSurvey(@RequestParam final String id) {
        return surveyService.getSurvey(id);
    }
}

