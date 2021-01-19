package modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.model.Channel;
import peter.finalprojectparallel.model.Message;
import peter.finalprojectparallel.model.User;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ChannelTest {

    @Test
    public void channelNullConstructorTest() {
        //given
        Channel testChannel = new Channel();
        //then
        Assertions.assertNotNull(testChannel);
    }

    @Test
    public void channelOLConstructorTest() {
        //given
        Channel testChannel = new Channel();
        Long testChannelId = 1L;
        String testChannelName = "MyTestChannel";
        String testDescription = "This is a test";
        List<Message> testMessageList = new ArrayList<>();
        Instant testInstant = Instant.now();
        User testUser = new User();
        Collection<User> testListOfSubscribers = new ArrayList<>();

        //when
        testChannel.setChannelId(testChannelId);
        testChannel.setChannelName(testChannelName);
        testChannel.setDescription(testDescription);
        testChannel.setSubscribedUsers(testListOfSubscribers);
        testChannel.setCreated(testInstant);
        testChannel.setMessageList(testMessageList);
        testChannel.setUser(testUser);
        //then
        Assertions.assertNotNull(testChannel);
    }

    @Test
    public void getChannelIDTest() {
        //given
        Channel testChannel = new Channel();
        Long expected = 1L;
        //when
        testChannel.setChannelId(expected);
        Long actual = testChannel.getChannelId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getChannelNameTest() {
        //given
        Channel testChannel = new Channel();
        String expected = "MyTestChannel";
        //when
        testChannel.setChannelName(expected);
        String actual = testChannel.getChannelName();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDescriptionTest() {
        //given
        Channel testChannel = new Channel();
        String expected = "This is a test";
        //when
        testChannel.setDescription(expected);
        String actual = testChannel.getDescription();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getMessageListTest() {
        //given
        Channel testChannel = new Channel();
        List<Message> expected = new ArrayList<>();
        //when
        testChannel.setMessageList(expected);
        List<Message> actual = testChannel.getMessageList();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCreatedTest() {
        //given
        Channel testChannel = new Channel();
        Instant expected = Instant.now();
        //when
        testChannel.setCreated(expected);
        Instant actual = testChannel.getCreated();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserTest() {
        //given
        Channel testChannel = new Channel();
        User expected = new User();
        //when
        testChannel.setUser(expected);
        User actual = testChannel.getUser();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getSubscribedUsersTest() {
        //given
        Channel testChannel = new Channel();
        Collection<User> expected = new ArrayList<>();
        //when
        testChannel.setSubscribedUsers(expected);
        Collection<User> actual = testChannel.getSubscribedUsers();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
