
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
    public Optional<PointOfReport> getPointOfReportById(UUID id) {
        return this.pointRepository.findPointOfReportById(id);
    }

    @Override
    public List<PointOfReport> findAll() {
        return this.pointRepository.findAll();
    }

    @Override
    public PointOfReport create(PointOfReport point) {
        if(point.getId() == null)
            point.setId(UUID.randomUUID());
        return this.pointRepository.save(point);
    }
    @Override
    public void deletePointById(UUID id) {
        this.pointRepository.deleteById(id);
    }

    @Override
    public List<PointOfReport> findByTitleLike(String title) {
        return this.pointRepository.findPointOfReportsByTitleLike(title);
    }

    @Override
    public List<PointOfReport> getPointOfReportByDescriptionLike(String description) {
        return this.pointRepository.findPointOfReportsByDescriptionLike(description);
    }

    @Override
    public List<PointOfReport> findByCep(String cep) {
        return this.pointRepository.findPointOfReportsByCEP(cep);
    }

    @Override
    public List<PointOfReport> findPointOfReportByCity(String city) {
        return this.pointRepository.findByCity(city);
    }

    @Override
    public List<PointOfReport> findpointOfReportByCountry(String country) {
        return this.pointRepository.findByCountry(country);
    }

    @Override
    public List<PointOfReport> findByAdress(String adress) {
        return this.pointRepository.findPointOfReportsByAdressLike(adress);
    }

    @Override
    public List<PointOfReport> findPointOfReportByState(String state) {
        return this.pointRepository.findPointOfReportsByState(state);
    }

    @Override
    public List<PointOfReport> findPointOfReportByStateAndCity(String state, String city) {
        return this.pointRepository.findByStateAndCity(state, city);
    }

    @Override
    public List<PointOfReport> findByLatitudeAndLongitude(double latitude, double longitude) {
        return this.pointRepository.findByLatitudeAndLongitude(latitude, longitude);
    }

    @Override
    public List<PointOfReport> findByPostId(UUID postid) {
        return this.pointRepository.findPointOfReportByPost_Id(postid);
    }

    @Override
    public List<PointOfReport> findPointsOfReportByPointOfReportId(UUID pointOfReportTagID) {
        return this.pointRepository.findPointOfReportsByPointOfReportTag_ID(pointOfReportTagID);
    }
}
