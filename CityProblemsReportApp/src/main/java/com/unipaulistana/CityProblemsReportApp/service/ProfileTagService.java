package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfileTagService {
    Optional<Profile_tag> getTagById(UUID id);
    List<Profile_tag> getAllTags();
    Profile_tag saveTag(Profile_tag tag);
    void deleteTag(UUID id);

    Optional<Profile_tag> findById(UUID id);

    void deleteById(UUID id);

    Optional<Profile_tag> update(Profile_tag profileTag);

    Profile_tag create(Profile_tag profileTag);
}
