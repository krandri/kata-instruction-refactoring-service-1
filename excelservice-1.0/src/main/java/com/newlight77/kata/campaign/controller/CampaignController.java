package com.newlight77.kata.campaign.controller;

import com.newlight77.kata.campaign.model.Campaign;
import com.newlight77.kata.survey.service.ExportCampaignService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    private final ExportCampaignService exportCampaignService;

    public CampaignController(final ExportCampaignService exportCampaignService) {
      this.exportCampaignService = exportCampaignService;
    }

    @PostMapping
    public void createCampaign(@RequestBody final Campaign campaign) {
        exportCampaignService.createCampaign(campaign);
    }

    @GetMapping("/{id}")
    public Campaign getCampaign(@PathVariable final String id) {
        return exportCampaignService.getCampaign(id);
    }

}

