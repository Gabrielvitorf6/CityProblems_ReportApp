package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReportTag;
import com.unipaulistana.CityProblemsReportApp.domainmodel.PointOfReport_Tag;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportTagRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PointTagServiceImpl implements PointTagService {

    private final PointOfReportTagRepository tagRepository;

    public PointTagServiceImpl(PointOfReportTagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Optional<PointOfReport_Tag> getTagById(UUID id) {
        return tagRepository.findById(id);
    }

    @Override
    public List<PointOfReport_Tag> getAllTags() {
        return tagRepository.findAll();
    }

    @Override
    public PointOfReport_Tag saveTag(PointOfReport_Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public void deleteTag(UUID id) {
        tagRepository.deleteById(id);
    }
}
