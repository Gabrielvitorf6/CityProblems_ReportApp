package com.unipaulistana.CityProblemsReportApp.audit;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "AuditorAwareRefimpl") //nome do bean pode ser qualquer um
@Configuration
public class AuditConfig {
}
