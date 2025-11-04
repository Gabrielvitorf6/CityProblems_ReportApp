package com.unipaulistana.CityProblemsReportApp.domainmodel;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TBL_USER_TAG", indexes = {@Index(name = "IDX_TITLE", columnList = "TITLE")
})
public class User_Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
