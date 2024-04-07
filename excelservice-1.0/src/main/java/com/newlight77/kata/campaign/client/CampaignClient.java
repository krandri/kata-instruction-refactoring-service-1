package com.newlight77.kata.campaign.client;

import com.newlight77.kata.campaign.model.Campaign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class CampaignClient {

    private final WebClient webClient;

    public CampaignClient(@Value("${external.url}") final String externalUrl) {
        webClient = WebClient.builder()
                .baseUrl(externalUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build();
    }


    public void createCampaign(final Campaign campaign) {
        webClient.post()
                .uri("/campaigns")
                .bodyValue(campaign);
    }

    public Campaign getCampaign(final String id) {
        return webClient.get()
                .uri("/campaigns/" + id)
                .retrieve()
                .bodyToMono(Campaign.class).block();
    }
}
