package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DecorationRepository extends JpaRepository<Decoration, UUID> {

    Optional<Decoration> findDecorationById(UUID id);

    List<Decoration> findByTitleLike(String title);

    List<Decoration> findByDescriptionLike(String description);

    List<Decoration> findDecorationsByValuePointsGreaterThan(int valuePointsIsGreaterThan);

    List<Decoration> findDecorationsByPost_Id(UUID postId);

    Optional<Decoration> findDecorationsByUserProfile_Id(UUID userProfileId);

    Optional<Decoration> findById(UUID id);

    void deleteById(UUID id);

    Decoration save(Decoration decoration);

    List<Decoration> findAll();
}
