package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Comment  extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 500, updatable = true)
    private String comment;

    @Column
    private int upVotes;

    @Column
    private int downVotes;

    @ManyToOne
    private User_profile userProfile;

    @ManyToOne
    private Post post;


}
