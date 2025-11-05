package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.domainmodel.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class PointOfReport_Tag extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private UUID ID;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 200)
    private String description;

    @OneToOne
    private User user; //Tags do PointOfReport : ManyToOne

    @OneToOne
    private PointOfReport_Tag pointOfReportTag;

}
