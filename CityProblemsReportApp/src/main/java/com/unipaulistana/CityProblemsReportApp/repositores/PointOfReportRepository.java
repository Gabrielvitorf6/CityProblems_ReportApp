package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportRepository extends JpaRepository<PointOfReport, UUID> {

    Optional<PointOfReport> findPointOfReportById(UUID id);

    List<PointOfReport> findPointOfReportsByTitleLike(String title);

    List<PointOfReport> findPointOfReportsByDescriptionLike(String description);

    List<PointOfReport> findPointOfReportsByCEP(String cep);

    List<PointOfReport> findPointOfReportsByAdressLike(String adress);

    //findporbyadressandadressnumber criar query

    List<PointOfReport> findByCity(String city);

    List<PointOfReport> findPointOfReportsByState(String state);
            
    List<PointOfReport> findByCountry(String country);

    List<PointOfReport> findByStateAndCity(String state, String city);

    List<PointOfReport> findByLatitudeAndLongitude(Double latitude, Double longitude);

    List<PointOfReport> findPointOfReportByPost_Id(UUID postId);

    List<PointOfReport> findPointOfReportsByPointOfReportTag_ID(UUID pointOfReportTagID);

    void deleteById(UUID id);
}
