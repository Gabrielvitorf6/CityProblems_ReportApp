package com.unipaulistana.CityProblemsReportApp.domainmodel;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

public class Audit_User {

    private UUID id;

    private UUID userId;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;


}
