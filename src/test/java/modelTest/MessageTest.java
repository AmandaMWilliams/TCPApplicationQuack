package modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.model.Channel;
import peter.finalprojectparallel.model.Message;
import peter.finalprojectparallel.model.User;

import java.time.Instant;

public class MessageTest {

    @Test
    public void messageNullConstructorTest() {
        //given
        Message message = new Message();
        //when
        //then
        Assertions.assertNotNull(message);
    }

    @Test
    public void messageOLConstructorTest() {
        //given
        Message message = new Message();
        Long testID = 123L;
        String testContent = "Test message";
        Instant testCreated = Instant.now();
        User testUser = new User();
        Channel testChannel = new Channel();
        //when
        message.setMessageId(testID);
        message.setContent(testContent);
        message.setCreated(testCreated);
        message.setUser(testUser);
        message.setChannel(testChannel);
        //then
        Assertions.assertNotNull(message);
    }

    @Test
    public void getMessageIDTest() {
        //given
        Message message = new Message();
        Long expected = 654L;
        //when
        message.setMessageId(expected);
        Long actual = message.getMessageId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getContentTest() {
        //given
        Message message = new Message();
        String expected = "this is a test message";
        //when
        message.setContent(expected);
        String actual = message.getContent();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCreatedTest() {
        //given
        Message message = new Message();
        Instant expected = Instant.now();
        //when
        message.setCreated(expected);
        Instant actual = message.getCreated();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUserTest() {
        //given
        Message message = new Message();
        User expected = new User();
        //when
        message.setUser(expected);
        User actual = message.getUser();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getChannelTest() {
        //given
        Message message = new Message();
        Channel expected = new Channel();
        //when
        message.setChannel(expected);
        Channel actual = message.getChannel();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
