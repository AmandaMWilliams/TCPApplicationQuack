package dtoTest;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.dto.MessageResponse;

public class MessageResponseTest {

    @Test
    public void NoArgsConstructorTest() {
        MessageResponse messageResponse = new MessageResponse();
        Assert.assertNotNull(messageResponse);
    }

    @Test
    public void AllArgsConstructorTest() {
        MessageResponse messageResponse = new MessageResponse(
                1l, "content", "duration", "thisChannel", "user"
        );
        Long expectedId = 1l;
        String expectedContent = "content";
        String expectedDuration = "duration";
        String expectedChanName = "thisChannel";
        String expectedUserName = "user";

        Assert.assertEquals(expectedId, messageResponse.getMessageId());
        Assert.assertEquals(expectedDuration, messageResponse.getDuration());
        Assert.assertEquals(expectedContent, messageResponse.getContent());
        Assert.assertEquals(expectedChanName, messageResponse.getChannelName());
        Assert.assertEquals(expectedUserName, messageResponse.getUserName());
    }
}
