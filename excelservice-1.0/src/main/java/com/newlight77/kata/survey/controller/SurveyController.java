package com.newlight77.kata.survey.controller;

import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.ExportCampaignService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    private final ExportCampaignService exportCampaignService;

    public SurveyController(final ExportCampaignService exportCampaignService) {
      this.exportCampaignService = exportCampaignService;
    }

    @PostMapping
    public void createSurvey(@RequestBody final Survey survey) {
        exportCampaignService.creerSurvey(survey);
    }

    @GetMapping("/{id}")
    public Survey getSurvey(@RequestParam final String id) {
        return exportCampaignService.getSurvey(id);
    }
}

