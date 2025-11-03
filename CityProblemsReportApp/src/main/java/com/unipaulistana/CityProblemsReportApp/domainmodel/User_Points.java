package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.util.Set;
import java.util.UUID;

public class User_Points {
    private UUID id;
    private UUID userId;
    private int points;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
