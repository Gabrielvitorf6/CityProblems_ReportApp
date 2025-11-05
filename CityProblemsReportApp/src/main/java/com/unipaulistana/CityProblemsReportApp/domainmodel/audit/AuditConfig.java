package com.unipaulistana.CityProblemsReportApp.domainmodel.audit;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "auditorAwareRefImpl") //nome do bean pode ser qualquer um
@Configuration
public class AuditConfig {
}
