package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportTagRepository extends JpaRepository<PointOfReportTag, UUID> {

    Optional<PointOfReportTag> findPointOfReport_TagByID(UUID id);

    List<PointOfReportTag> findByTitleLike(String title);

    List<PointOfReportTag> findByDescriptionLike(String description);

    List<PointOfReportTag> findPointOfReport_TagsByPointOfReport(PointOfReport pointOfReport);

    Optional<PointOfReportTag> findById(UUID id);

    List<PointOfReportTag> findAll();

    PointOfReportTag save(PointOfReportTag tag);

    void deleteById(UUID id);
}
