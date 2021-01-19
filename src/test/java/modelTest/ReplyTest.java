package modelTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.model.Message;
import peter.finalprojectparallel.model.Reply;
import peter.finalprojectparallel.model.User;

import java.time.Instant;

public class ReplyTest {

    @Test
    public void replyNullConstructorTest() {
        //given
        Reply test = new Reply();
        //when
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void replyOLConstructorTest() {
        //given
        Reply test = new Reply();
        Long testReplyId = 987L;
        String testContent = "Hello again";
        Message testMessage = new Message();
        Instant testCreated = Instant.now();
        User testUser = new User();
        //when
        test.setReplyId(testReplyId);
        test.setContent(testContent);
        test.setCreated(testCreated);
        test.setMessage(testMessage);
        test.setUser(testUser);
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getReplyIDTest() {
        //given
        Reply test = new Reply();
        Long expected = 1234L;
        //when
        test.setReplyId(expected);
        Long actual = test.getReplyId();
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getContentTest() {
        //given
        Reply test = new Reply();
        String expected = "This is fun";
        //when
        test.setContent(expected);
        String actual = test.getContent();
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getMessageTest() {
        //given
        Reply test = new Reply();
        Message expected = new Message();
        //when
        test.setMessage(expected);
        Message actual = test.getMessage();
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getCreatedTest() {
        //given
        Reply test = new Reply();
        Instant expected = Instant.now();
        //when
        test.setCreated(expected);
        Instant actual = test.getCreated();
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getUserTest() {
        //given
        Reply test = new Reply();
        User expected = new User();
        //when
        test.setUser(expected);
        User actual = test.getUser();
        //then
        Assertions.assertNotNull(test);
    }
}
