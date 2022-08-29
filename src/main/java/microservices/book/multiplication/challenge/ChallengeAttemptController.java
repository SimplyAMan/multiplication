package microservices.book.multiplication.challenge;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/attempts")
public class ChallengeAttemptController {
    private final ChallengeGeneratorService challengeGeneratorService;

/*    @RequestMapping("/{challengeId}")
    public String getChallenge(
            @PathVariable("challengeId") Long challengeId,
            @RequestParam("factorA") int factorA
    ){
        log.info("challengeId - {}", challengeId);
        log.info("factorA - {}", factorA);
        return null;
    }*/
}
