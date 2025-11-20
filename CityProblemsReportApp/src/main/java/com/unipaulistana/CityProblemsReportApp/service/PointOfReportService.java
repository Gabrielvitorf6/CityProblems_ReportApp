
package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportService {
    Optional<PointOfReport> getPointOfReportById(UUID id);
    List<PointOfReport> findAll();
    PointOfReport create(PointOfReport point);
    void deletePointById(UUID id);

    List<PointOfReport> findByTitleLike(String title);

    List<PointOfReport> getPointOfReportByDescriptionLike(String description);

    List<PointOfReport> findByCep(String cep);

    List<PointOfReport> findPointOfReportByCity(String city);

    List<PointOfReport> findpointOfReportByCountry(String country);

    List<PointOfReport> findByAdress(String adress);

    List<PointOfReport> findPointOfReportByState(String state);

    List<PointOfReport> findPointOfReportByStateAndCity(String state, String city);

    List<PointOfReport> findByLatitudeAndLongitude(double latitude, double longitude);

    List<PointOfReport> findByPostId(UUID postid);

    List<PointOfReport> findPointsOfReportByPointOfReportId(UUID pointOfReportTagID);
}
