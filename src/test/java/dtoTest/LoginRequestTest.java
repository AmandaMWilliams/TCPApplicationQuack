package dtoTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.LoginRequest;

public class LoginRequestTest {

    @Test
    public void NoArgsConstructorTest() {
        LoginRequest loginRequest = new LoginRequest();
        Assertions.assertNotNull(loginRequest);
    }

    @Test
    public void AllArgsConstructorTest() {
        LoginRequest loginRequest = new LoginRequest("name", "password");
        String expectedName = "name";
        String expectedPw = "password";
        Assert.assertEquals(expectedName, loginRequest.getUsername());
        Assert.assertEquals(expectedPw, loginRequest.getPassword());
    }
}
