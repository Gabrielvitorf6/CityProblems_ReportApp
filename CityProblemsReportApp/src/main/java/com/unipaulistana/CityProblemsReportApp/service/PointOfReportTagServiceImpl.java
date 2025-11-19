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
        return tagRepository.findById(id);
    }

    @Override
    public List<PointOfReportTag> getAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public PointOfReportTag saveTag(PointOfReportTag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void deleteTag(UUID id) {
        tagRepository.deleteById(id);
    }

    @Override
    public Optional<PointOfReportTagService> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Optional<PointOfReportTag> update(Comment comment) {
        return Optional.empty();
    }

    @Override
    public PointOfReportTag create(Comment comment) {
        return null;
    }
}
