package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.domainmodel.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Decorations extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length  = 200)
    private String description;

    @Column(nullable = false)
    private int ValuePoints; /*quantidade de pontos que o usuário
     condecorado recebe ao receber essa condecoração */

    @ManyToOne
//    @JoinColumn(name = "decoration_id")
    private Post post; //Condecorações de um post : ManyToOne

    @ManyToOne
    //@JoinColumn(name = "userProfile")
    private User_profile userProfile;
}
