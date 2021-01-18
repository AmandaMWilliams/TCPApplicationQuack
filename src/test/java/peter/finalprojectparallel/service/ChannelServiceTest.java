package peter.finalprojectparallel.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import peter.finalprojectparallel.dto.ChannelDto;
import peter.finalprojectparallel.model.Channel;
import peter.finalprojectparallel.model.User;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ChannelServiceTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ChannelService channelService;

    @Test
    void saveTest() {
        //given

        //when
        //then
    }

    @Test
    void getAllChannelsTest() {
        //given
        ChannelDto mockDto1 = new ChannelDto();
        ChannelDto mockDto2 = new ChannelDto();
        List<ChannelDto> mockChannelList= new ArrayList<>();
        mockChannelList.add(mockDto1);
        mockChannelList.add(mockDto2);
        //when
        Mockito.when(channelService.getAllChannels()).thenReturn(mockChannelList);
        //then
        Assert.assertEquals(mockChannelList, channelService.getAllChannels());
    }

    @Test
    void addUserByIdTest() {
        //given
        Long givenChannelId = 1l;
        Long givenUserId = 2l;
        User mockUser1 = new User();
        mockUser1.setUserId(givenUserId);
        ChannelDto mockChannelDto = new ChannelDto();
        mockChannelDto.setChannelId(givenChannelId);
        //when
        Mockito.when(channelService.addUserById(givenUserId, givenChannelId))
                .thenReturn(null);
        //then
        Assert.assertEquals(mockUser1, channelService.addUserById(1l, 2l));
    }

    @Test
    void deleteByIdTest() {
        //given
        ChannelDto mockDto = new ChannelDto();
        mockDto.setChannelId(258l);
        Long testDtoId = mockDto.getChannelId();
        List<ChannelDto> mockDtoList = new ArrayList<>();
        mockDtoList.add(mockDto);
        //when
        Mockito.when(channelService.deleteById(testDtoId)).thenReturn("Channel with channel ID 258 successfully deleted.");
        //then
        Assert.assertNotEquals(mockDtoList, channelService.getAllChannels());
    }

    @Test
    void getChannelByIdTest() {
        //given
        Long testChannelId = 123l;
        ChannelDto mockChannel = new ChannelDto();
        mockChannel.setChannelId(testChannelId);
        //when
        Mockito.when(channelService.getChannelById(testChannelId))
                .thenReturn(mockChannel);
        //then
        Assert.assertEquals(mockChannel, channelService.getChannelById(123l));
    }
}