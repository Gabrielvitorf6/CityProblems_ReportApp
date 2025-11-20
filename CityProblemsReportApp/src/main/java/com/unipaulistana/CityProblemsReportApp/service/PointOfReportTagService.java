package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagService {
    Optional<PointOfReportTag> getTagById(UUID id);
    List<PointOfReportTag> getAllTags();
    PointOfReportTag saveTag(PointOfReportTag tag);
    void deleteTag(UUID id);

    Optional<PointOfReportTagService> findById(UUID id);

    void deleteById(UUID id);

    Optional<PointOfReportTag> update(Comment comment);

    PointOfReportTag create(Comment comment);
}
