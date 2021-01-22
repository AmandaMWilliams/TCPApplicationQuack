package controllerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import peter.finalprojectparallel.controller.MessageController;
import peter.finalprojectparallel.service.MessageService;

@RunWith(MockitoJUnitRunner.class)
public class MessageControllerTest {

    @Mock
    private MessageService messageService;

    @InjectMocks
    private MessageController messageController;


    @Test
    public void create() {

    }

    @Test
    public void getMessagesByChannel() {

    }

    @Test
    public void createWithSock() {

    }

}
