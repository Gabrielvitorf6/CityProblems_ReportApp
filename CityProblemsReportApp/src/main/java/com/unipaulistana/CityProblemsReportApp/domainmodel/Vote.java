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
    private UUID uuid;

    /*public enum VoteType{
        upvote(1),
        downvote(-1);
*/

    }

