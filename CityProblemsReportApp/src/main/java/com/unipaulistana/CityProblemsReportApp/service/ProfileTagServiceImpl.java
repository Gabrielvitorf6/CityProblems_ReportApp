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
        return profileTagRepository.findProfile_tagById(id);
    }

    @Override
    public List<Profile_tag> getAllTags() {
        return profileTagRepository.findAll();
    }
    @Override
    public void deleteById(UUID id) {
    this.profileTagRepository.deleteById(id);
    }

    @Override
    public Profile_tag create(Profile_tag profileTag) {
        return this.profileTagRepository.save(profileTag);
    }

    @Override
    public List<Profile_tag> findByTitleLike(String title) {
        return this.profileTagRepository.findProfile_tagsByTitleLike(title);
    }

    @Override
    public List<Profile_tag> findByDescriptionLike(String description) {
        return this.profileTagRepository.findProfile_tagsByDescriptionLike(description);
    }

    @Override
    public List<Profile_tag> findByUserProfileId(UUID id) {
        return this.profileTagRepository.findAllByUserProfile_Id(id);
    }

}
