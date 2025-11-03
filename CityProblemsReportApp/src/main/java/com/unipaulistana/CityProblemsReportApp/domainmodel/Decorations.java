package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.util.UUID;

public class Decorations {
    private UUID id;
    private String title;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public int getPointsValue() {
        return pointsValue;
    }

    public void setPointsValue(int pointsValue) {
        this.pointsValue = pointsValue;
    }

    private String description;
    private int pointsValue; /*quantidade de pontos que o usuário
     condecorado recebe ao receber essa condecoração */


}
