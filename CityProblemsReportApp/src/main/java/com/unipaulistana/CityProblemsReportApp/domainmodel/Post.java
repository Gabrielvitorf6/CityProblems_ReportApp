package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.domainmodel.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
public class Post extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String title;

    private int Upvotes;

    private int Downvotes;

    @Column(length = 500)
    private String comment;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Decorations> decorations; //Condecorações do post: OneToMany com decorations

    @ManyToOne
    //@JoinColumn(name = "posts")
    private User_profile userProfile; //perfil que fez o post: ManyToOne com profile

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private PointOfReport pointOfReport;
}
