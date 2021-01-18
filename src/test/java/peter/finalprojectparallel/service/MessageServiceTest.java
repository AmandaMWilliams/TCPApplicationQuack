package peter.finalprojectparallel.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import peter.finalprojectparallel.mapper.MessageMapper;
import peter.finalprojectparallel.model.Message;
import peter.finalprojectparallel.repository.ChannelRepository;
import peter.finalprojectparallel.repository.MessageRepository;

import static org.junit.jupiter.api.Assertions.*;

public class MessageServiceTest {

//    private final MessageRepository messageRepository;
//    private final ChannelRepository channelRepository;
//    private final MessageMapper messageMapper;
//    private final AuthService authService;

    private MessageRepository messageRepository = Mockito.mock(MessageRepository.class);
    private ChannelRepository channelRepository = Mockito.mock(ChannelRepository.class);
    private MessageMapper messageMapper = Mockito.mock(MessageMapper.class);
    private AuthService authService = Mockito.mock(AuthService.class);

    @Test
    void create() {
        MessageService messageService = new MessageService(
                messageRepository, channelRepository, messageMapper, authService);
        Message message = new Message();
        Mockito.when(messageRepository.save(message));
    }

    @Test
    void getAllByChannel() {
    }
}