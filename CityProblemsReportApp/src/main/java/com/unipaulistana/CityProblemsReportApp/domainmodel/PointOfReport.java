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

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
