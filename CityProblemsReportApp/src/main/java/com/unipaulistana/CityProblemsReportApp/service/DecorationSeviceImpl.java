package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.repositores.DecorationRepository;
import com.unipaulistana.CityProblemsReportApp.repositores.PointOfReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DecorationSeviceImpl implements DecorationService {
    private final PointOfReportRepository pointOfReportRepository;

    @Override
    public List<Decoration> finById(UUID id) {
        return List.of();
    }

    @Override
    public Optional<Decoration> update(Decoration decoration) {
        return Optional.empty();
    }

    @Override
    public Decoration create(Decoration decoration) {
        return null;
    }
}

