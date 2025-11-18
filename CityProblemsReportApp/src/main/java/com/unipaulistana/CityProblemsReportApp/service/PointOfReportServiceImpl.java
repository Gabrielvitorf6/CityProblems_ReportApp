package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PointOfReportServiceImpl implements PointOfReportService {

    private final PointOfReportRepository pointRepository;

    public PointOfReportServiceImpl(PointOfReportRepository pointRepository) {
        this.pointRepository = pointRepository;
    }

    @Override
    public Optional<PointOfReport> getPointById(UUID id) {
        return pointRepository.findById(id);
    }

    @Override
    public List<PointOfReport> getAllPoints() {
        return pointRepository.findAll();
    }

    @Override
    public PointOfReport savePoint(PointOfReport point) {
        return pointRepository.save(point);
    }

    @Override
    public void deletePoint(UUID id) {
        pointRepository.deleteById(id);
    }
}
