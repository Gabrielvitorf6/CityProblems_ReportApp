package com.unipaulistana.CityProblemsReportApp.domainmodel;

import com.unipaulistana.CityProblemsReportApp.audit.Auditable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Vote extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

     /*enum VoteType {
         upvote(1),
         downvote(-1);

         VoteType(int i) {
         }
     }*/
    @ManyToOne
    private Post post;

    @ManyToOne
    private Comment comment;

    @ManyToOne
    private User_profile user_profile;

    @ManyToOne
    private Vote vote;

    public User_profile getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(User_profile user_profile) {
        this.user_profile = user_profile;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}

