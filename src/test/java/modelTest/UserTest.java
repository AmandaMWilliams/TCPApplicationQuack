package modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.model.Channel;
import peter.finalprojectparallel.model.User;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    public void userNullConstructorTest() {
        //given
        User testUser = new User();
        //then
        Assertions.assertNotNull(testUser);
    }

    @Test
    public void userOLConstructorTest() {
        //given
        User testUser = new User();
        Long testUserId = 1L;
        String testUserName = "AmandaW";
        String testPassword = "z!pC0de";
        String testEmail = "amanda@zipcode.com";
        Instant testInstant = Instant.now();
        Boolean testEnabled = true;
        List<Channel> testSubscribedChannel = new ArrayList<>();

        //when
        testUser.setUserId(testUserId);
        testUser.setUsername(testUserName);
        testUser.setPassword(testPassword);
        testUser.setEmail(testEmail);
        testUser.setCreated(testInstant);
        testUser.setEnabled(testEnabled);
        testUser.setSubscribedChannels(testSubscribedChannel);
        //then
        Assertions.assertNotNull(testUser);
    }

    @Test
    public void getUserIDTest() {
        //given
        User testUser = new User();
        Long expected = 2L;
        //when
        testUser.setUserId(expected);
        Long actual = testUser.getUserId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserNameTest() {
        //given
        User testUser = new User();
        String expected = "AmandaW";
        //when
        testUser.setUsername(expected);
        String actual = testUser.getUsername();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getPasswordTest() {
        //given
        User testUser = new User();
        String expected = "z!pc0de";
        //when
        testUser.setPassword(expected);
        String actual = testUser.getPassword();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getEmailTest() {
        //given
        User testUser = new User();
        String expected = "Amanda@zipcode.com";
        //when
        testUser.setEmail(expected);
        String actual = testUser.getEmail();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCreatedTest() {
        //given
        User testUser = new User();
        Instant expected = Instant.now();
        //when
        testUser.setCreated(expected);
        Instant actual = testUser.getCreated();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getEnabledTest() {
        //given
        User testUser = new User();
        //when
        testUser.setEnabled(true);
        //then
        Assertions.assertTrue(testUser.getEnabled());
    }

    @Test
    public void geSubscribedChannelsTest() {
        //given
        User testUser = new User();
        List<Channel> expected = new ArrayList<>();
        //when
        testUser.setSubscribedChannels(expected);
        List<Channel> actual = testUser.getSubscribedChannels();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
