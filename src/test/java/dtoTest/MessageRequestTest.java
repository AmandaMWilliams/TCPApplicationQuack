package dtoTest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.dto.MessageRequest;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class MessageRequestTest {

    @Test
    public void noArgsConstructorTest() {
        MessageRequest messageRequest = new MessageRequest();
        Assertions.assertNotNull(messageRequest);
    }

    @Test
    public void AllArgsConstructorTest() {
        MessageRequest messageRequest = new MessageRequest(
                1l, "content", Instant.now(), "thisChannel"
        );
        Long expectedId = 1l;
        String expectedContent = "content";
        Instant expectedInstant = Instant.now();
        String expectedChanName = "thisChannel";
        Assert.assertEquals(expectedId, messageRequest.getMessageId(), .0000001);
        Assert.assertEquals(expectedContent, messageRequest.getContent());
        Assert.assertEquals(expectedInstant, messageRequest.getCreated());
        Assert.assertEquals(expectedChanName, messageRequest.getChannelName());
    }

}
