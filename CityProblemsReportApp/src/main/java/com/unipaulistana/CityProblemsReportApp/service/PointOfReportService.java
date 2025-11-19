
package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportService {
    Optional<PointOfReport> getPointById(UUID id);
    List<PointOfReport> getAllPoints();
    PointOfReport savePoint(PointOfReport point);
    void deletePoint(UUID id);

    Optional<PointOfReport> findById(UUID id);

    void deleteById(UUID id);

    Optional<PointOfReport> update(PointOfReport pointOfReport);

    PointOfReport create(PointOfReport pointOfReport);
}
