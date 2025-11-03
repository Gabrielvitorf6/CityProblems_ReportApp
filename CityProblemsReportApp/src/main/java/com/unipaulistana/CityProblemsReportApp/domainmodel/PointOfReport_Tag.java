package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.util.UUID;

public class PointOfReport_Tag {
    private UUID ID;
    private String title;
    private String description;

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
