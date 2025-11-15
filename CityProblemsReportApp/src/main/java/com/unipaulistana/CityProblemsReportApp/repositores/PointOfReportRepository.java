package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport_Tag;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PointOfReportRepository extends JpaRepository<PointOfReport, UUID> {

    Optional<PointOfReport> findPointOfReportById(UUID id);

    List<PointOfReport> findPointOfReportsByTitleLike(String title);

    List<PointOfReport> findPointOfReportsByDescriptionLike(String description);

    List<PointOfReport> findPointOfReportsByCEP(String cep);

    List<PointOfReport> findPointOfReportsByAdress(String adress);

    //findporbyadressandadressnumber criar query

    List<PointOfReport> findByCity(String city);

    List<PointOfReport> findBystate(String state);
            
    List<PointOfReport> findByCountry(String country);

    List<PointOfReport> findByStateAndCity(String state, String city);

    List<PointOfReport> findByLatitudeAndLongitude(Double latitude, Double longitude);

    List<PointOfReport> findPointOfReportByPost(Post post);

    List<PointOfReport> findPointOfReportsByPointOfReportTag(PointOfReport_Tag pointOfReportTag);
}
