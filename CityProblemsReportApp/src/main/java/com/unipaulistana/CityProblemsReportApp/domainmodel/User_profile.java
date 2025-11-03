package com.unipaulistana.CityProblemsReportApp.domainmodel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class User_profile {
    private UUID id;
    private String nickname;
    private List<Post> posts;
    private String bio;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Optional<User> followers;
    private Optional<User> following;
    private String profilePictureUrl;
    private int Totalupvotes; //joincolumn de post
    private int Totaldownvotes;  //joincolumn de post
}
