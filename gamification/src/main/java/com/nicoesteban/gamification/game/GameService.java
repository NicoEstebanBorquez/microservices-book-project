package com.nicoesteban.gamification.game;

import com.nicoesteban.gamification.challenge.ChallengeSolvedDTO;
import com.nicoesteban.gamification.game.domain.BadgeType;
import lombok.Value;

import java.util.List;

public interface GameService {

    /**
     * Process a new attempt from a given user.
     * @param challenge the challenge data with the user details, factors, etc.
     * @return a {@link GameResult} object containing the new score and badge cards obtained.
     */
    GameResult newAttemptForUser(ChallengeSolvedDTO challenge);

    @Value
    class GameResult {
        int score;
        List<BadgeType> badges;
    }

}
