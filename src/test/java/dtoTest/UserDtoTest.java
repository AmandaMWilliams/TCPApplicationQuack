package dtoTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.dto.UserDto;

public class UserDtoTest {

    @Test
    public void UserDTONullConstructorTest(){
        //given
        UserDto userDto = new UserDto();
        //when
        //then
        Assertions.assertNotNull(userDto);
    }

    @Test
    public void UserDTOOLConstructorTest(){
        //given
        UserDto userDto = new UserDto();
        Long testID = 6543L;
        String testUsername = "Oberg";
        String testEmail = "oberg@zipcode.com";
        Integer testNumberOfChannels = 2;
        //when
        userDto.setId(testID);
        userDto.setUsername(testUsername);
        userDto.setEmail(testEmail);
        userDto.setNumberOfChannels(testNumberOfChannels);
        //then
        Assertions.assertNotNull(userDto);
    }

    @Test
    public void getIdTest(){
        //given
        UserDto userDto = new UserDto();
        Long expected = 4123L;
        //when
        userDto.setId(expected);
        Long actual = userDto.getId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getUsernameTest(){
        //given
        UserDto userDto = new UserDto();
        String expected = "AmandaW";
        //when
        userDto.setUsername(expected);
        String actual = userDto.getUsername();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getEmailTest(){
        //given
        UserDto userDto = new UserDto();
        String expected = "Kutchen@zipcode.com";
        //when
        userDto.setEmail(expected);
        String actual = userDto.getEmail();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfChannelsTest(){
        //given
        UserDto userDto = new UserDto();
        Integer expected = 89;
        //when
        userDto.setNumberOfChannels(expected);
        Integer actual = userDto.getNumberOfChannels();
        //then
        Assertions.assertEquals(expected, actual);
    }

}
