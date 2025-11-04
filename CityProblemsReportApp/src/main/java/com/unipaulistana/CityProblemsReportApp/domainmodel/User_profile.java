package com.unipaulistana.CityProblemsReportApp.domainmodel;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Entity
@Table(name = "TBL_USER_PROFILE", indexes = {@Index(name = "IDX_NICKNAME", columnList = "nickname")
})
public class User_profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private UUID id;

    @Column(name = "NICKNAME",  unique = true, nullable = false)
    private String nickname;

    private List<Post> posts;
    private String bio;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Optional<User> followers;
    private Optional<User> following;
    private String profilePictureUrl;
    private int Totalupvotes; //joincolumn de post

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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Optional<User> getFollowers() {
        return followers;
    }

    public void setFollowers(Optional<User> followers) {
        this.followers = followers;
    }

    public Optional<User> getFollowing() {
        return following;
    }

    public void setFollowing(Optional<User> following) {
        this.following = following;
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

    public int getTotaldownvotes() {
        return Totaldownvotes;
    }

    public void setTotaldownvotes(int totaldownvotes) {
        Totaldownvotes = totaldownvotes;
    }

    private int Totaldownvotes;  //joincolumn de post
}
