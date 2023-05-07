package com.nicoesteban.multiplication.challenge;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ChallengeAttemptRepository extends CrudRepository<ChallengeAttempt, Long> {
    /**
     * @return the last 10 attempts for a given user, identified by their alias.
     */

    //QUERY METHOD: This is automatically created by SpringData
    List<ChallengeAttempt> findTop10ByUserAliasOrderByIdDesc(String userAlias);


   // This is another way creating my own query with JPQL (Java Persistence Query Lang)
    @Query("SELECT a FROM ChallengeAttempt a WHERE a.user.alias = ?1 ORDER BY a.id DESC")
    List<ChallengeAttempt> lastAttempts(String userAlias);

}
