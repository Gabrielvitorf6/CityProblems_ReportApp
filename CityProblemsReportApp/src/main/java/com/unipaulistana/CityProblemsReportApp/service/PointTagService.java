package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport_Tag;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointTagService {
    Optional<PointOfReport_Tag> getTagById(UUID id);
    List<PointOfReport_Tag> getAllTags();
    PointOfReport_Tag saveTag(PointOfReport_Tag tag);
    void deleteTag(UUID id);
}
