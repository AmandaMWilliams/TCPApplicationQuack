package dtoTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.dto.MessageRequest;

import static org.junit.jupiter.api.Assertions.*;

class MessageRequestTest {

    @Test
    public void noArgsConstructorTest() {
        MessageRequest messageRequest = new MessageRequest();
        Assertions.assertNotNull(messageRequest);
    }

    @Test
    public void AllArgsConstructorTest() {
        MessageRequest messageRequest = new MessageRequest();
    }

    @Test
    void getMessageId() {

    }

    @Test
    void getContent() {
    }
}
