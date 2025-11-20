package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfileTagRepository extends JpaRepository<Profile_tag, UUID> {

    Optional<Profile_tag> findProfile_tagById(UUID id);

    List<Profile_tag> findProfile_tagsByTitleLike(String title);

    List<Profile_tag> findProfile_tagsByDescriptionLike(String description);

    List<Profile_tag> findAllByUserProfile_Id(UUID userProfileId);

    void deleteById(UUID id);
}
