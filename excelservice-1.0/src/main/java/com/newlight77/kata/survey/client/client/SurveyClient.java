package com.newlight77.kata.survey.client.client;

import com.newlight77.kata.survey.model.Survey;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class SurveyClient {

    private final WebClient webClient;

    public SurveyClient(@Value("${external.url}") final String externalUrl) {
        webClient = WebClient.builder()
                .baseUrl(externalUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .build();
    }

    public void createSurvey(final Survey survey) {
        webClient.post()
                .uri("/surveys")
                .bodyValue(survey)
                .retrieve();
    }

    public Survey getSurvey(final String id) {
        return webClient.get()
                .uri("/surveys/" + id)
                .retrieve()
                .bodyToMono(Survey.class).block();
    }
}
