
package com.unipaulistana.CityProblemsReportApp.service;

import com.unipaulistana.CityProblemsReportApp.domainmodel.Vote;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VoteService {
    Optional<Vote> getVoteById(UUID id);
    List<Vote> getAllVotes();
    Vote saveVote(Vote vote);
    void deleteVote(UUID id);

    Optional<Vote> findById(UUID id);

    void deleteById(UUID id);

    Optional<Vote> update(Vote vote);

    Vote create(Vote vote);
}
