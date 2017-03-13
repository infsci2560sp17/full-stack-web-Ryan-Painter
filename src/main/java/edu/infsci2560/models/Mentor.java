package edu.infsci2560.models;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 * @author Ryan Painter
 */
@Entity
public class Mentor {

    private static final long serialVersionUID = 1L;

    public enum MentorSpecializationType {
        Other,
        SecurityMonitoring,
        DigitalForensics,
        PenetrationTesting,
        ApplicationSecurity,
        SecurityEngineering,
        VulnerabilityManagement
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected MentorSpecializationType mentorSpecializationType;

    public Mentor() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.mentorSpecializationType = MentorSpecializationType.Other;
    }

    public Mentor(Long id, String title, MentorSpecializationType mentorSpecializationType) {
        this.id = id;
        this.title = title;
        this.mentorSpecializationType = mentorSpecializationType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", mentorSpecializationType=" + this.mentorSpecializationType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the mentorSpecializationType
     */
    public MentorSpecializationType getMentorSpecializationType() {
        return mentorSpecializationType;
    }

    /**
     * @param mentorSpecializationType the mentorSpecializationType to set
     */
    public void setMentorSpecializationType(MentorSpecializationType mentorSpecializationType) {
        this.mentorSpecializationType = mentorSpecializationType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}