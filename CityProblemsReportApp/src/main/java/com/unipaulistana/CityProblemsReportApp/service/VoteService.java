package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import com.unipaulistana.CityProblemsReportApp.repositores.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VoteService {

    private final VoteRepository voteRepo;

    public VoteService(VoteRepository voteRepo) {
        this.voteRepo = voteRepo;
    }

    public Vote create(Vote vote) {
        return voteRepo.save(vote);
    }

    public boolean alreadyVoted(Post post, User_profile userProfile) {
        List<Vote> votes = voteRepo.findAllByPost(post);
        return votes.stream().anyMatch(v -> v.getUserProfile().equals(userProfile));
    }

    public int countVotes(Post post) {
        return voteRepo.findAllByPost(post).size();
    }

    public int countVotes(Comment comment) {
        return voteRepo.findAllByComment(comment).size();
    }

    public void delete(UUID id) {
        voteRepo.deleteById(id);
    }
}
