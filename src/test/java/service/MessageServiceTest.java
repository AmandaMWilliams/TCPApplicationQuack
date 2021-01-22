package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import peter.finalprojectparallel.dto.MessageResponse;
import peter.finalprojectparallel.mapper.MessageMapper;
import peter.finalprojectparallel.model.Channel;
import peter.finalprojectparallel.model.Message;
import peter.finalprojectparallel.model.User;
import peter.finalprojectparallel.repository.ChannelRepository;
import peter.finalprojectparallel.repository.MessageRepository;
import peter.finalprojectparallel.service.AuthService;
import peter.finalprojectparallel.service.MessageService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceTest {

//    private final MessageRepository messageRepository;
//    private final ChannelRepository channelRepository;
//    private final MessageMapper messageMapper;
//    private final AuthService authService;

    private MessageRepository messageRepository = Mockito.mock(MessageRepository.class);
    private ChannelRepository channelRepository = Mockito.mock(ChannelRepository.class);
    private MessageMapper messageMapper = Mockito.mock(MessageMapper.class);
    private AuthService authService = Mockito.mock(AuthService.class);

    private List<MessageResponse> messageResponseList;
    private MessageResponse testMessageResponse;

    @Before
    public void setup() {
        messageResponseList= new ArrayList<>();
        testMessageResponse = new MessageResponse(1L, "This is test message content", "testDuration", "testChannelName", "testUserName");
        messageResponseList.add(testMessageResponse);
    }

    @Test
    public void createTest() {
        MessageService messageService = new MessageService(
                messageRepository, channelRepository, messageMapper, authService);
        Message message = new Message();
        Mockito.when(messageRepository.save(message));
    }

    @Test
    void getAllByChannelTest() {
        //given
        MessageService messageService = new MessageService(messageRepository, channelRepository, messageMapper, authService);
        List<Message> mockList = new ArrayList<>();
        Long channelID = 1L;
        Channel channel = new Channel();
        channel.setChannelId(channelID);
        Message givenMessage = new Message();
        mockList.add(givenMessage);
        channel.setMessageList(mockList);
        //when
        Mockito.when(messageService.getAllByChannel(channelID)).thenReturn((List<MessageResponse>) testMessageResponse);
        //then
        Assertions.assertEquals(mockList, messageService.getAllByChannel(1L));
    }
}
