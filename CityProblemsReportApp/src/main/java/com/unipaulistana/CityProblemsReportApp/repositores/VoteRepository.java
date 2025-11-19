package com.unipaulistana.CityProblemsReportApp.repositores;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Comment;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Post;
import com.unipaulistana.CityProblemsReportApp.domainmodel.User_profile;
import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VoteRepository extends JpaRepository
        <Vote, UUID> {

    Optional<Vote> findVoteById(UUID id);

    List<Vote> findAllByPost(Post post);

    List<Vote> findAllByComment(Comment comment);

    List<Vote> findAllByPostAndComment(Post post, Comment comment);

    Optional<Vote> findById(UUID id);

    List<Vote> findAll();

    Vote save(Vote vote);

    void deleteById(UUID id);

    //List<Vote> findAllByUser_profile(User_profile userProfile); //criar query caso erro persista
}
