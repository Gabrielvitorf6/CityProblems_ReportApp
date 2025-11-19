package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.data.domain.Limit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DecorationRepository extends JpaRepository<Decoration, UUID> {

    Optional<Decoration> findDecorationById(UUID id);

    List<Decoration> findByTitleLike(String title);

    List<Decoration> findByDescriptionLike(String description);

    List<Decoration> findDecorationsByValuePointsGreaterThan(int valuePointsIsGreaterThan);

    List<Decoration> findDecorationsByPost(Post post);

    List<Decoration> findDecorationsByUserProfile(User_profile userProfile);

    Optional<Decoration> findById(UUID id);

    List<Decoration> findAll();

    Decoration save(Decoration decoration);

    void deleteById(UUID id);
}
