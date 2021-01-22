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
}
