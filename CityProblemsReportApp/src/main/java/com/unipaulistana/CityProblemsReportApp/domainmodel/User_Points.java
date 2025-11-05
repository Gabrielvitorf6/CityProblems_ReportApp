package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.domainmodel.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "TBL_USERPOINTS")
public class User_Points extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User_profile userProfile; //Perfil dono dos pontos: ManyToOne

    @Column
    private int points; //Total de pontos do usuário

    //Entidade para mapear os pontos dos usuários
}
