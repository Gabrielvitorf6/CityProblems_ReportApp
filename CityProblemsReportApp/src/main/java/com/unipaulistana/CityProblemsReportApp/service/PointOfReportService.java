package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PointOfReportService {

    private final PointOfReportRepository reportRepo;

    public PointOfReportService(PointOfReportRepository reportRepo) {
        this.reportRepo = reportRepo;
    }

    public PointOfReport create(PointOfReport report) {
        return reportRepo.save(report);
    }

    public Optional<PointOfReport> getById(UUID id) {
        return reportRepo.findPointOfReportById(id);
    }

    public List<PointOfReport> listAll() {
        return reportRepo.findAll();
    }

    public List<PointOfReport> listByCity(String city) {
        return reportRepo.findByCity(city);
    }

    public List<PointOfReport> listByState(String state) {
        return reportRepo.findBystate(state);
    }

    public List<PointOfReport> listByStateAndCity(String state, String city) {
        return reportRepo.findByStateAndCity(state, city);
    }

    public void delete(UUID id) {
        reportRepo.deleteById(id);
    }
}
