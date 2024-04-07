package com.newlight77.kata.campaign.model;

import com.newlight77.kata.address.AddressStatus;
import lombok.Data;

import java.util.List;

@Data
public class Campaign {
    private String id ;
    private String surveyId;
    private List<AddressStatus> addressStatuses;
}
