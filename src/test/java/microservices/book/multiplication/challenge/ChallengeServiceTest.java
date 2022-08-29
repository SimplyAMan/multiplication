package microservices.book.multiplication.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.*;

class ChallengeServiceTest {
    private ChallengeService challengeService;

    @BeforeEach
    void setUp() {
        challengeService = new ChallengeServiceImpl();
    }

    @Test
    void checkCorrectAttemptTest() {
        // given
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 60, "john_doe", 3000);

        // when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

        // then
        then(resultAttempt.isCorrect()).isTrue();
    }

    @Test
    public void checkWrongAttemptTest() {
        // given
        ChallengeAttemptDTO challengeAttemptDTO = new ChallengeAttemptDTO(50, 50, "john_doe", 5000);

        // when
        ChallengeAttempt resultAttempt = challengeService.verifyAttempt(challengeAttemptDTO);

        // then
        then(resultAttempt.isCorrect()).isFalse();
    }
}