package com.max.reminder.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailNotificationRequest {

    @JsonProperty("recipient")
    private String recipient;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("body")
    private String body;

    @JsonProperty("schedule")
    private String schedule;
}
