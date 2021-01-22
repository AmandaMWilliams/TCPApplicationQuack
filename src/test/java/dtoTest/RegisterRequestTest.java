package dtoTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.RegisterRequest;

public class RegisterRequestTest {

    @Test
    public void NoArgsConstructorTest() {
        RegisterRequest registerRequest = new RegisterRequest();
        Assertions.assertNotNull(registerRequest);
    }

    @Test
    public void AllArgsConstructorTest() {
        RegisterRequest registerRequest = new RegisterRequest("email", "user", "1234");

        String expectedEmail = "email";
        String expectedUsername = "user";
        String expectedPassword = "1234";

        Assert.assertEquals(expectedEmail, registerRequest.getEmail());
        Assert.assertEquals(expectedUsername, registerRequest.getUsername());
        Assert.assertEquals(expectedPassword, registerRequest.getPassword());
    }
}
