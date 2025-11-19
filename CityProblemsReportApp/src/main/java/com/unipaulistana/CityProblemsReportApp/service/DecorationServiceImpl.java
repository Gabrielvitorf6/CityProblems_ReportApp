
package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.repositores.DecorationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DecorationServiceImpl implements DecorationService {

    private final DecorationRepository decorationRepository;

    public DecorationServiceImpl(DecorationRepository decorationRepository) {
        this.decorationRepository = decorationRepository;
    }

    @Override
    public Optional<Decoration> getDecorationById(UUID id) {
        return decorationRepository.findDecorationById(id);
    }

    @Override
    public List<Decoration> getAllDecorations() {
        return decorationRepository.findAll();
    }

    @Override
    public Decoration create(Decoration decoration) {
        return decorationRepository.save(decoration);
    }

    @Override
    public void deleteById(UUID id) {
        decorationRepository.deleteById(id);
    }

    @Override
    public List<Decoration> getDecorationsByTitleLike(String title) {
        return this.decorationRepository.findByTitleLike(title);
    }

    @Override
    public List<Decoration> getDecorationsByDescrptionsLike(String description) {
        return this.decorationRepository.findByDescriptionLike(description);
    }

    @Override
    public List<Decoration> getDecorationsWithPointsGreaterThan(int valuePointsIsGreaterThan) {
        return this.decorationRepository.findDecorationsByValuePointsGreaterThan(valuePointsIsGreaterThan);
    }

    @Override
    public List<Decoration> getDecorationsByPostId(UUID id) {
        return this.decorationRepository.findDecorationsByPost_Id(id);
    }

    @Override
    public Optional<Decoration> getDecorationsByUSerProfile_Id(UUID userprofileID) {
        return this.decorationRepository.findDecorationsByUserProfile_Id(userprofileID);
    }
}
