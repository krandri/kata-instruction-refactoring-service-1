package com.newlight77.kata.survey.model;

import com.newlight77.kata.address.Address;
import com.newlight77.kata.question.Question;
import lombok.Data;

import java.util.List;

@Data
public class Survey {
    private String id;
    private String sommary;
    private String client;
    private Address clientAddress;
    private List<Question> questions;
}

