package com.newlight77.kata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailServiceConfig {

  @Value("${service.mail.from}")
  private String from;

  @Value("${service.mail.to}")
  private String[] to;

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String[] getTo() {
    return to;
  }

  public void setTo(String[] to) {
    this.to = to;
  }  
}
