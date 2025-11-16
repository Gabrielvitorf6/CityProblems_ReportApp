package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Decoration;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.repositores.DecorationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DecorationService {

    private final DecorationRepository decorationRepo;

    public DecorationService(DecorationRepository decorationRepo) {
        this.decorationRepo = decorationRepo;
    }

    public void giveDecoration(User_profile userProfile, String title, String description, int valuePoints) {
        Decoration d = new Decoration();
        d.setUserProfile(userProfile);
        d.setTitle(title);
        d.setDescription(description);
        d.setValuePoints(valuePoints);
        decorationRepo.save(d);
    }

    public List<Decoration> getDecorations(User_profile userProfile) {
        return decorationRepo.findDecorationsByUserProfile(userProfile);
    }
}
