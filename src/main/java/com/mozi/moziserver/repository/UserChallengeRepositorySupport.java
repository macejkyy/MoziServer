package com.mozi.moziserver.repository;

import com.mozi.moziserver.model.entity.Challenge;
import com.mozi.moziserver.model.entity.UserChallenge;
import com.mozi.moziserver.model.mappedenum.PlanDateResultType;
import com.mozi.moziserver.model.mappedenum.UserChallengeStateType;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface UserChallengeRepositorySupport {

    Optional<UserChallenge> findUserChallengeByUserSeqAndChallengeAndStates(Long userSeq, Challenge challenge, Collection<UserChallengeStateType> states);

    List<UserChallenge> findAllByUserSeq(
        Long userSeq,
        Integer pageSize,
        Long prevLastUserChallengeSeq
    );

    List<UserChallenge> findAllByPeriod(
            Long userSeq,
            LocalDate startDate,
            LocalDate endDate,
            Long challengeSeq
    );

    List<UserChallenge> findAllByPlanResult(
            LocalDate date,
            PlanDateResultType planResult
    );

    Long updateState(
            LocalDate date,
            UserChallengeStateType beforeState,
            UserChallengeStateType afterState
    );
}