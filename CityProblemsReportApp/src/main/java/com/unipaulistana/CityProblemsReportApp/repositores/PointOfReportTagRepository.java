package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport_Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagRepository extends JpaRepository<PointOfReport_Tag, UUID> {

    Optional<PointOfReport_Tag> findPointOfReport_TagByID(UUID id);

    List<PointOfReport_Tag> findByTitleLike(String title);

    List<PointOfReport_Tag> findByDescriptionLike(String description);

    List<PointOfReport_Tag> findPointOfReport_TagsByPointOfReport(PointOfReport pointOfReport);
}
