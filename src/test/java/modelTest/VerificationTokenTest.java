package modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.model.User;
import peter.finalprojectparallel.model.VerificationToken;

import java.time.Instant;

public class VerificationTokenTest {

    @Test
    public void vTokenNullConstructorTest() {
        //given
        VerificationToken test = new VerificationToken();
        //when
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void vTokenOLConstructorTest() {
        //given
        VerificationToken test = new VerificationToken();
        Long testID = 65432L;
        String testToken = "fheoinkfapfe0-32";
        User testUser = new User();
        Instant testExpirationDate = Instant.now();
        //when
        test.setVerificationTokenId(testID);
        test.setToken(testToken);
        test.setUser(testUser);
        test.setExpirationDate(testExpirationDate);
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getVTokenIdTest() {
        //given
        VerificationToken test = new VerificationToken();
        Long expected = 2589L;
        //when
        test.setVerificationTokenId(expected);
        Long actual = test.getVerificationTokenId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTokenTest() {
        //given
        VerificationToken test = new VerificationToken();
        String expected = "afsfdsd";
        //when
        test.setToken(expected);
        String actual = test.getToken();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserTest() {
        //given
        VerificationToken test = new VerificationToken();
        User expected = new User();
        //when
        test.setUser(expected);
        User actual = test.getUser();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getExpirationDateTest() {
        //given
        VerificationToken test = new VerificationToken();
        Instant expected = Instant.now();
        //when
        test.setExpirationDate(expected);
        Instant actual = test.getExpirationDate();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
