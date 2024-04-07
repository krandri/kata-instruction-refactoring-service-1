package com.newlight77.kata.campaign.service;

import com.newlight77.kata.campaign.model.Campaign;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {

    private final com.newlight77.kata.campaign.client.CampaignService campaignWebService;

    public CampaignService(final com.newlight77.kata.campaign.client.CampaignService campaignWebService) {
        this.campaignWebService = campaignWebService;
    }


    public void createCampaign(final Campaign campaign) {
        campaignWebService.createCampaign(campaign);
    }

    public Campaign getCampaign(final String id) {
        return campaignWebService.getCampaign(id);
    }

}
