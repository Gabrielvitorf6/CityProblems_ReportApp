package com.unipaulistana.CityProblemsReportApp.domainmodel;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

public class Audit_UserPoints {
    private UUID id;
    private UUID userPointsId; //joincolumn de user_points

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @CreatedDate
    private LocalDateTime createdAt;

    private int TotalPoints; //joincolumn de userpoints
}
