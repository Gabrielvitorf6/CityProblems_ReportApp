package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(indexes = {
        @Index(name = "IDX_POST", columnList = "post"),
        @Index(name = "IDX_POINTOFREPORTTAG", columnList = "pointOfReportTag"),
        @Index(name = "IDX_CEP", columnList = "CEP"),
        @Index(name = "IDX_ADRESS", columnList = "adress")
})
public class PointOfReport extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 200)
    private String description;

    @Column(nullable = false, length = 8)
    private String CEP;

    @Column(nullable = false, length = 35)
    private String adress;

    @Column(nullable = false, length = 5)
    private String adress_number;

    @Column(nullable = false, length = 30)
    private String city;

    @Column(nullable = false, length = 25)
    private String state;

    @Column(nullable = false, length = 25)
    private String country;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @OneToOne
    //@JoinColumn(name = "PointOfReportID")
    private Post post; //Perfil que criou o POR: OneToOne

    @OneToOne
    private PointOfReport_Tag pointOfReportTag;     //Lista de tags do ponto de report: OneToOne
}
