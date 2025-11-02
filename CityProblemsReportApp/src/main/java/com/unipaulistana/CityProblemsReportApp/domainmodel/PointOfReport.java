package com.unipaulistana.CityProblemsReportApp.domainmodel;

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
    private List<Up_votes> upVotes;
    private List<Down_votes> downVotes;

}
