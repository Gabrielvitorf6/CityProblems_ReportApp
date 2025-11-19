package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Profile_tag;
import com.unipaulistana.CityProblemsReportApp.repositores.ProfileTagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProfileTagServiceImpl implements ProfileTagService {

    private final ProfileTagRepository profileTagRepository;

    public ProfileTagServiceImpl(ProfileTagRepository profileTagRepository) {
        this.profileTagRepository = profileTagRepository;
    }

    @Override
    public Optional<Profile_tag> getTagById(UUID id) {
        return profileTagRepository.findById(id);
    }

    @Override
    public List<Profile_tag> getAllTags() {
        return profileTagRepository.findAll();
    }

    @Override
    public Profile_tag saveTag(Profile_tag tag) {
        return profileTagRepository.save(tag);
    }

    @Override
    public void deleteTag(UUID id) {
        profileTagRepository.deleteById(id);
    }

    @Override
    public Optional<Profile_tag> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<Profile_tag> update(Profile_tag profileTag) {
        return Optional.empty();
    }

    @Override
    public Profile_tag create(Profile_tag profileTag) {
        return null;
    }
}
