package com.newlight77.kata.campaign.controller;

import com.newlight77.kata.campaign.model.Campaign;
import com.newlight77.kata.campaign.service.CampaignService;
import com.newlight77.kata.export.service.ExportCampaignService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(final CampaignService campaignService) {
      this.campaignService = campaignService;
    }

    @PostMapping
    public void createCampaign(@RequestBody final Campaign campaign) {
        campaignService.createCampaign(campaign);
    }

    @GetMapping("/{id}")
    public Campaign getCampaign(@PathVariable final String id) {
        return campaignService.getCampaign(id);
    }

}

