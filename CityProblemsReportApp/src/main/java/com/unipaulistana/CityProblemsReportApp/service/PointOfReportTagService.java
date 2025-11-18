package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;

import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagService {
    Optional<PointOfReportTagService> findById(UUID id);

    void deleteById(UUID id);

    Optional<PointOfReportTag> update(Comment comment);

    PointOfReportTag create(Comment comment);
}
