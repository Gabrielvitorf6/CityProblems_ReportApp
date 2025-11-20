package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagService {
    Optional<PointOfReportTag> getTagById(UUID id);
    
    List<PointOfReportTag> getAllTags();

    void deleteById(UUID id);
    
    List<PointOfReportTag> findByTagTitleLike(String name);

    List<PointOfReportTag> findByDescriptionLike(String name);

    List<PointOfReportTag> findByPointOfReportId(UUID pointOfReportId);

    PointOfReportTag create(PointOfReportTag pointOfReportTag);
}
