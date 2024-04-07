package com.newlight77.kata.export.controller;

import com.newlight77.kata.campaign.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.export.service.ExportCampaignService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/export")
public class ExportController {

    private final ExportCampaignService exportCampaignService;

    public ExportController(final ExportCampaignService exportCampaignService) {
        this.exportCampaignService = exportCampaignService;
    }

    @PostMapping(value = "/{campaignId}")
    public void exportCampaign(@RequestParam final String campaignId) {
        exportCampaignService.exportCampaign(campaignId);
    }
}

