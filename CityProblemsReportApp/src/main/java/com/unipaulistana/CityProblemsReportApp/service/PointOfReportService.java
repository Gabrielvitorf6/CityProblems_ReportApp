package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface PointOfReportService {

    Optional<PointOfReport> findById(UUID id);

    void deleteById(UUID id);

    Optional<PointOfReport> update(PointOfReport pointOfReport);

    PointOfReport create(PointOfReport pointOfReport);
}

