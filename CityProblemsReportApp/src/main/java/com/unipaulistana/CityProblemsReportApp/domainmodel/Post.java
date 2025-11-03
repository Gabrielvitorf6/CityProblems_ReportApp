package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Post {
    private UUID id;
    private String title;
    private Set<User> user;
    private Set<PointOfReport>  pointOfReport;
    private Set<PointOfReport_Tag> pointOfReportTag;
    private int Upvotes;
    private int Downvotes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Decorations> decorations;
    private String comments;
}
