package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfileTagService {
    Optional<Profile_tag> getTagById(UUID id);
    List<Profile_tag> getAllTags();

    void deleteById(UUID id);

    Profile_tag create(Profile_tag profileTag);

    List<Profile_tag> findByTitleLike(String title);

    List<Profile_tag> findByDescriptionLike(String description);

    List<Profile_tag> findByUserProfileId(UUID id);
}
