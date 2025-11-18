package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportRepository;

import java.util.Optional;
import java.util.UUID;

public class PointOfReportImpl implements PointOfReportService {

    private PointOfReportRepository pointOfReportRepository;

    @Override
    public Optional<PointOfReport> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<PointOfReport> update(PointOfReport pointOfReport) {
        return Optional.empty();
    }

    @Override
    public PointOfReport create(PointOfReport pointOfReport) {
        return null;
    }
}
