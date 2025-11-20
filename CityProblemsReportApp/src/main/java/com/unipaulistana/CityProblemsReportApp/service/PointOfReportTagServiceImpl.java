package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportTagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PointOfReportTagServiceImpl implements PointOfReportTagService {

    private final PointOfReportTagRepository tagRepository;

    public PointOfReportTagServiceImpl(PointOfReportTagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Optional<PointOfReportTag> getTagById(UUID id) {
        return this.tagRepository.findByID(id);
    }

    @Override
    public List<PointOfReportTag> getAllTags() {
        return this.tagRepository.findAll();
    }
    @Override
    public void deleteById(UUID id) {
        this.tagRepository.deleteById(id);
    }
    @Override
    public List<PointOfReportTag> findByTagTitleLike(String name) {
        return this.tagRepository.findByTitleLike(name);
    }
    @Override
    public List<PointOfReportTag> findByDescriptionLike(String name) {
        return this.tagRepository.findByDescriptionLike(name);
    }

    @Override
    public List<PointOfReportTag> findByPointOfReportId(UUID pointOfReportId) {
        return this.tagRepository.findPointOfReport_TagsByPointOfReport_Id(pointOfReportId);
    }

    @Override
    public PointOfReportTag create(PointOfReportTag pointOfReportTag) {
        return this.tagRepository.save(pointOfReportTag);
    }
}
