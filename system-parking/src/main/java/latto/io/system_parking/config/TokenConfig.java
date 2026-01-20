package latto.io.system_parking.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import latto.io.system_parking.entity.User;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TokenConfig {
    private String secret = "teste";

    public String generateToken(User user) {
        Algorithm algorithm = Algorithm.HMAC256(secret);

        return JWT.create()
                .withClaim("userId", user.getId().toString())
                .withSubject(user.getEmail())
                .withExpiresAt(Instant.now().plusSeconds(77777))
                .withIssuedAt(Instant.now())
                .sign(algorithm);
    }


}
