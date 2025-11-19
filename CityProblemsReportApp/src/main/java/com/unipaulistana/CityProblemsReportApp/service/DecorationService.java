
package com.unipaulistana.CityProblemsReportApp.service;

import java.util.Optional;
import java.util.List;
import java.util.UUID;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;

public interface DecorationService {
    Optional<Decoration> getDecorationById(UUID id);
    List<Decoration> getAllDecorations();
    Decoration create(Decoration decoration);
    void deleteById(UUID id);

    List<Decoration> getDecorationsByTitleLike(String title);

    List<Decoration> getDecorationsByDescrptionsLike(String description);

    List<Decoration> getDecorationsWithPointsGreaterThan(int valuePointsIsGreaterThan);

    List<Decoration> getDecorationsByPostId(UUID id);

    Optional<Decoration> getDecorationsByUSerProfile_Id(UUID userprofileID);
}
