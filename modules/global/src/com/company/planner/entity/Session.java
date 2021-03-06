package com.company.planner.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.beans.Transient;
import java.time.LocalDateTime;

@NamePattern("%s|topic")
@Table(name = "PLANNER_SESSION")
@Entity(name = "planner_Session")
public class Session extends StandardEntity {
    private static final long serialVersionUID = 3271255497931152196L;

    @NotNull
    @Column(name = "TOPIC", nullable = false)
    protected String topic;

    @Column(name = "TYPE_")
    protected String type;

    @NotNull
    @Column(name = "START_DATE", nullable = false)
    protected LocalDateTime startDate;

    @Positive(message = "Must be at least 1 minunte or greater")
    @NotNull
    @Column(name = "DURATION", nullable = false)
    protected Integer duration;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SPEAKER_ID")
    protected Speaker speaker;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Transient
    @MetaProperty(related = {"startDate", "duration"})
    public LocalDateTime getEndDate() {
        return (startDate != null && duration != null)? startDate.plusHours(duration):null;

    }
}