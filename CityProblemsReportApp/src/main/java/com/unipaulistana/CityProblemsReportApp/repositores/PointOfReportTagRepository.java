package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagRepository extends JpaRepository<PointOfReportTag, UUID> {

    List<PointOfReportTag> findByTitleLike(String title);

    List<PointOfReportTag> findByDescriptionLike(String description);

    List<PointOfReportTag> findPointOfReport_TagsByPointOfReport_Id(UUID pointOfReportId);

    Optional<PointOfReportTag> findByID(UUID id);

}
