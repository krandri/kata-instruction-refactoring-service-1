package com.newlight77.kata.survey.service;

import com.newlight77.kata.survey.client.client.SurveyClient;
import com.newlight77.kata.survey.model.Survey;
import org.springframework.stereotype.Component;

@Component
public class SurveyService {

  private final SurveyClient surveyClient;

  public SurveyService(final SurveyClient surveyClient) {
    this.surveyClient = surveyClient;
  }

  public void createSurvey(final Survey survey) {
    surveyClient.createSurvey(survey);
  }

  public Survey getSurvey(final String id) {
    return surveyClient.getSurvey(id);
  }


}
