package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import com.unipaulistana.CityProblemsReportApp.repositores.VoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VoteServiceImpl implements VoteService {

    private final VoteRepository voteRepository;

    public VoteServiceImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public Optional<Vote> getVoteById(UUID id) {
        return this.voteRepository.findVoteById(id);
    }

    @Override
    public List<Vote> getAllVotes() {
        return this.voteRepository.findAll();
    }

    @Override
    public Vote saveVote(Vote vote) {
        return this.voteRepository.save(vote);
    }

    @Override
    public void deleteVote(UUID id) {
        this.voteRepository.deleteById(id);
    }

    @Override
    public Vote update(Vote vote) { return this.voteRepository.save(vote); }

    @Override
    public List<Vote> findAllByPost_Id(UUID postid) {
        return this.voteRepository.findAllByPost_Id(postid);
    }

    @Override
    public List<Vote> findAllByComment_Id(UUID id) {
        return  this.voteRepository.findAllByComment_Id(id);
    }

}
