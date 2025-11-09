package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(indexes = {
        @Index(name = "IDX_POINTOFREPORT", columnList = "pointOfReport"),
        @Index(name = "IDX_USERPROFILE", columnList = "userProfile")
})
public class Post extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column
    private int upVotes;

    @Column
    private int downVotes;

    @Column(length = 500)
    private String comment;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Decoration> decorations; //Condecorações do post: OneToMany com decorations

    @ManyToOne
    private User_profile userProfile; //perfil que fez o post: ManyToOne com profile

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private PointOfReport pointOfReport;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;
}
