package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Post {
    private UUID id;
    private String title;
    private Set<User> user;
    private Set<PointOfReport>  pointOfReport;
    private Set<PointOfReport_Tag> pointOfReportTag;
    private int Upvotes;
    private int Downvotes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Decorations> decorations;
    private String comments;

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

    public Set<User> getUser() {
        return user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public Set<PointOfReport> getPointOfReport() {
        return pointOfReport;
    }

    public void setPointOfReport(Set<PointOfReport> pointOfReport) {
        this.pointOfReport = pointOfReport;
    }

    public Set<PointOfReport_Tag> getPointOfReportTag() {
        return pointOfReportTag;
    }

    public void setPointOfReportTag(Set<PointOfReport_Tag> pointOfReportTag) {
        this.pointOfReportTag = pointOfReportTag;
    }

    public int getUpvotes() {
        return Upvotes;
    }

    public void setUpvotes(int upvotes) {
        Upvotes = upvotes;
    }

    public int getDownvotes() {
        return Downvotes;
    }

    public void setDownvotes(int downvotes) {
        Downvotes = downvotes;
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

    public List<Decorations> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decorations> decorations) {
        this.decorations = decorations;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
