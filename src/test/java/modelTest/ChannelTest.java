package modelTest;

import org.junit.Assert;
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
        Assertions.assertEquals(testChannelId, testChannel.getChannelId());
        Assertions.assertEquals(testChannelName, testChannel.getChannelName());
        Assertions.assertEquals(testInstant, testChannel.getCreated());
        Assertions.assertEquals(testDescription, testChannel.getDescription());
        Assertions.assertEquals(testUser, testChannel.getUser());
        Assertions.assertEquals(testMessageList, testChannel.getMessageList());
        Assertions.assertEquals(testListOfSubscribers, testChannel.getSubscribedUsers());
    }

    @Test
    public void getChannelIDTest() {
        //given
        //when
        //then

    }

    @Test
    public void getChannelNameTest() {
        //given
        //when
        //then
    }

    @Test
    public void getDescriptionTest() {
        //given
        //when
        //then
    }

    @Test
    public void getMessageListTest() {
        //given
        //when
        //then
    }

    @Test
    public void getCreatedTest() {
        //given
        //when
        //then
    }

    @Test
    public void getUserTest() {
        //given
        //when
        //then
    }

    @Test
    public void getSubscribedUsersTest() {
        //given
        //when
        //then
    }
}
