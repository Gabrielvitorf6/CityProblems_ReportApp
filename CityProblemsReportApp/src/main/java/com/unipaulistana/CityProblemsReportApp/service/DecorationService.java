package com.unipaulistana.CityProblemsReportApp.service;

import java.util.Optional;
import java.util.List;
import java.util.UUID;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;

public interface DecorationService {
    Optional<Decoration> getDecorationById(UUID id);
    List<Decoration> getAllDecorations();
    Decoration saveDecoration(Decoration decoration);
    void deleteDecoration(UUID id);
}
