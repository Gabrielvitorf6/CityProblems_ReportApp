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
        return decorationRepository.findById(id);
    }

    @Override
    public List<Decoration> getAllDecorations() {
        return decorationRepository.findAll();
    }

    @Override
    public Decoration saveDecoration(Decoration decoration) {
        return decorationRepository.save(decoration);
    }

    @Override
    public void deleteDecoration(UUID id) {
        decorationRepository.deleteById(id);
    }
}
