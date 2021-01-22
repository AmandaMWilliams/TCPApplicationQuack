package dtoTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.AuthenticationResponse;

import java.time.Instant;

public class AuthenticationResponseTest {

    @Test
    public void AuthResponseNullConstructorTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        //when
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void AuthResponseOLConstructorTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        String testAuthenticationToken = "tokennnnnn";
        String testUsername = "AmandaW";
        String testRefreshToken = "Tokenenenen";
        Instant testExpiresAt = Instant.now();
        //when
        test.setAuthenticationToken(testAuthenticationToken);
        test.setUsername(testUsername);
        test.setRefreshToken(testRefreshToken);
        test.setExpiresAt(testExpiresAt);
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getAuthenticationTokenTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        String expected = "TestToken";
        //when
        test.setAuthenticationToken(expected);
        String actual = test.getAuthenticationToken();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUsernameTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        String expected = "Kutchen";
        //when
        test.setUsername(expected);
        String actual = test.getUsername();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRefreshTokenTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        String expected = "Testrefreshtoken";
        //when
        test.setRefreshToken(expected);
        String actual = test.getRefreshToken();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getExpiresAtTest(){
        //given
        AuthenticationResponse test = new AuthenticationResponse();
        Instant expected = Instant.now();
        //when
        test.setExpiresAt(expected);
        Instant actual = test.getExpiresAt();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
