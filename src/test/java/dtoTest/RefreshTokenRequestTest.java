package dtoTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.RefreshTokenRequest;

public class RefreshTokenRequestTest {

    @Test
    public void NoArgsConstructorTest() {
        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest();
        Assertions.assertNotNull(refreshTokenRequest);
    }

    @Test
    public void AllArgsConstructorTest() {
        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest("token", "person");

        String expectedName = "token";
        String expectedUsername = "person";
        Assert.assertEquals(expectedName, refreshTokenRequest.getRefreshToken());
        Assert.assertEquals(expectedUsername, refreshTokenRequest.getUsername());
    }
}
