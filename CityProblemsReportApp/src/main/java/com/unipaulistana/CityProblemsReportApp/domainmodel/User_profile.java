package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table( indexes = {@Index(name = "IDX_NICKNAME", columnList = "nickname")
})
public class User_profile extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String nickname;

    @Column(nullable = true, length = 1000)
    private String bio;

    @Column(nullable = true)
    private String profilePictureUrl;

    @Column(nullable = true)
    private int Totalupvotes; //joincolumn de post

    @OneToMany(mappedBy = "userProfile",  fetch = FetchType.EAGER)
    private Set<Profile_tag> profileTags; //tags do perfil : OnetoMany com Profile_tag

    @OneToMany(mappedBy = "userProfile",   fetch = FetchType.EAGER)
    private List<Decoration> decorationsList; //lista de condecorações : OneToMany (Essa em específico puxa o total de condecorções da conta)

    @OneToMany(mappedBy = "userProfile", fetch = FetchType.EAGER)
    private List<Post> posts; //Posts do perfil : OneToMany

    @OneToMany(mappedBy = "userProfile", fetch =  FetchType.EAGER)
    private List<User_Points> userPoints;

    @OneToOne
    //@JoinColumn(name = "user")
    private User user; //Usuário do perfil : OneToOne com User

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL)
    private List<Comment> comments;
    //Coluna com seguidores e seguindo tem que ser implementada, falar com o professor

    @OneToMany
    private List<Vote> votes;

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public int getTotalupvotes() {
        return Totalupvotes;
    }

    public void setTotalupvotes(int totalupvotes) {
        Totalupvotes = totalupvotes;
    }

    public Set<Profile_tag> getProfileTags() {
        return profileTags;
    }

    public void setProfileTags(Set<Profile_tag> profileTags) {
        this.profileTags = profileTags;
    }

    public List<Decoration> getDecorationsList() {
        return decorationsList;
    }

    public void setDecorationsList(List<Decoration> decorationsList) {
        this.decorationsList = decorationsList;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<User_Points> getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(List<User_Points> userPoints) {
        this.userPoints = userPoints;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}