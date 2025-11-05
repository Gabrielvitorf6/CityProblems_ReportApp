package com.unipaulistana.CityProblemsReportApp.domainmodel.audit;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("AuditorAwareRefimpl")
public class AuditorAwareimpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ADMIN");
    }
}
