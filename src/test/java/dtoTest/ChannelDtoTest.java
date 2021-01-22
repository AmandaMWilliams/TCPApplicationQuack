package dtoTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.ChannelDto;

public class ChannelDtoTest {

    @Test
    public void channelDtoNullConstructorTest(){
        //given
        ChannelDto channelDto = new ChannelDto();
        //when
        //then
        Assertions.assertNotNull(channelDto);
    }

    @Test
    public void channelDtoOLConstructorTest(){
        //given
        ChannelDto channelDto = new ChannelDto();
        Long testChannelID = 543L;
        String testChannelName = "TestChannelName";
        String testDescription = "Test description";
        Integer testNumberOfMessages = 7;
        Integer testNumberOfUsers = 4;
        //when
        channelDto.setChannelId(testChannelID);
        channelDto.setChannelName(testChannelName);
        channelDto.setDescription(testDescription);
        channelDto.setNumberOfMessages(testNumberOfMessages);
        channelDto.setNumberOfUsers(testNumberOfUsers);
        //then
        Assertions.assertNotNull(channelDto);
    }
}
