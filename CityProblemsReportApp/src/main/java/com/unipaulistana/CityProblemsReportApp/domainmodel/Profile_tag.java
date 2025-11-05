package com.unipaulistana.CityProblemsReportApp.domainmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "TBL_USER_TAG", indexes = {@Index(name = "IDX_TITLE", columnList = "title")
})
public class Profile_tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "userProfile")
    private User_profile userProfile; //Tags de um perfil :  ManyToOne
}