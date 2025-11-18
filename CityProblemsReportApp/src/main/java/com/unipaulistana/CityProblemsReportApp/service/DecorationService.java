package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface DecorationService {

    List<Decoration> finById(UUID id);

    Optional<Decoration> update(Decoration decoration);

    Decoration create(Decoration decoration);
}
