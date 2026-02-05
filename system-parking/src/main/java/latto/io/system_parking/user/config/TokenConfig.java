package latto.io.system_parking.user.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import latto.io.system_parking.user.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Component
public class TokenConfig {
    @Value("${JWT_SECRET}")
    private String secret;

    public String generateToken(User user) {
        Algorithm algorithm = Algorithm.HMAC256(secret);

        return JWT.create()
                .withClaim("userId", user.getId().toString())
                .withSubject(user.getEmail())
                .withExpiresAt(Instant.now().plusSeconds(77777))
                .withIssuedAt(Instant.now())
                .sign(algorithm);
    }


    public Optional<JWTUserData> validateToken(String token)  {


        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            DecodedJWT decode = JWT.require(algorithm)
                    .build().verify(token);

            return Optional.of(JWTUserData.builder()
                            .userId(UUID.fromString(decode.getClaim("userId").asString()))
                            .email(decode.getSubject())
                            .build());
        } catch (JWTVerificationException ex) {
            return Optional.empty();
        }

    }
}
