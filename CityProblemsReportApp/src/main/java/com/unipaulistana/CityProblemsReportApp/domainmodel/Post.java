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

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<Decoration> decorations; //Condecorações do post: OneToMany com decorations

    @ManyToOne
    private User_profile userProfile; //perfil que fez o post: ManyToOne com profile

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private PointOfReport pointOfReport;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany
    private List<Vote> votes;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }
    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public User_profile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(User_profile userProfile) {
        this.userProfile = userProfile;
    }

    public PointOfReport getPointOfReport() {
        return pointOfReport;
    }

    public void setPointOfReport(PointOfReport pointOfReport) {
        this.pointOfReport = pointOfReport;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
}
