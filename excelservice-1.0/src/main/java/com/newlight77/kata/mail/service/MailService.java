package com.newlight77.kata.mail.service;

import com.newlight77.kata.config.MailServiceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class MailService {
  private JavaMailSender mailSender;
  private MailServiceConfig mailServiceConfig;
  private static final Logger logger = LoggerFactory.getLogger(MailService.class);

  public MailService(final JavaMailSender mailSender, final MailServiceConfig mailServiceConfig) {
    this.mailSender = mailSender;
    this.mailServiceConfig = mailServiceConfig;
  }

  public void send(File attachment) {
    MimeMessagePreparator messagePreparator = mimeMessage -> {
      MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
      messageHelper.setFrom(mailServiceConfig.getFrom());
      messageHelper.setTo(mailServiceConfig.getTo());
      messageHelper.setSubject("Campaign Results");
      messageHelper.setText("Hi,\n\nYou will find in the attached file the campaign results.");

      FileSystemResource file = new FileSystemResource(attachment);
      messageHelper.addAttachment(file.getFilename(), file);
    };
    try {
      mailSender.send(messagePreparator);
      logger.info("Email sent successfully");
    } catch (MailException e) {
      throw new RuntimeException("An error occurred while sending an email", e);
    }
  }

}
