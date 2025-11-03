package com.unipaulistana.CityProblemsReportApp.domainmodel;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class PointOfReport {
    private UUID id;
    private String title;
    private String description;
    private String CEP;
    private String adress;
    private String adress_number;
    private String city;
    private String state;
    private String country;
    private Double latitude;
    private Double longitude;
    private Set<User> user;
    private List<PointOfReport_Tag> pointOfReportTags;
    private List<Audit_Report> auditsReport;
    private int pointsReceived;

    @CreatedDate
    private LocalDateTime createdAt;

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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress_number() {
        return adress_number;
    }

    public void setAdress_number(String adress_number) {
        this.adress_number = adress_number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public List<PointOfReport_Tag> getPointOfReportTags() {
        return pointOfReportTags;
    }

    public void setPointOfReportTags(List<PointOfReport_Tag> pointOfReportTags) {
        this.pointOfReportTags = pointOfReportTags;
    }

    public List<Audit_Report> getAuditsReport() {
        return auditsReport;
    }

    public void setAuditsReport(List<Audit_Report> auditsReport) {
        this.auditsReport = auditsReport;
    }

    public int getPointsReceived() {
        return pointsReceived;
    }

    public void setPointsReceived(int pointsReceived) {
        this.pointsReceived = pointsReceived;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
