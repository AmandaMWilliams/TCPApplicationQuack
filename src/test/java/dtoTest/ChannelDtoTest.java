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

    @Test
    public void getChannelIDTest(){
        //given
        ChannelDto test = new ChannelDto();
        Long expected = 8L;
        //when
        test.setChannelId(expected);
        Long actual = test.getChannelId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getChannelNameTest(){
        //given
        ChannelDto test = new ChannelDto();
        String expected = "Test Channel Name";
        //when
        test.setChannelName(expected);
        String actual = test.getChannelName();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDescriptionTest(){
        //given
        ChannelDto test = new ChannelDto();
        String expected = "Test description";
        //when
        test.setDescription(expected);
        String actual = test.getDescription();
        //then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfMessagesTest(){
        //given
        ChannelDto test = new ChannelDto();
        Integer expected = 5;
        //when
        test.setNumberOfMessages(expected);
        Integer actual = test.getNumberOfMessages();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfUsersTest(){
        //given
        ChannelDto test = new ChannelDto();
        Integer expected = 3;
        //when
        test.setNumberOfUsers(expected);
        Integer actual = test.getNumberOfUsers();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
