package controllerTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import peter.finalprojectparallel.controller.ChannelController;
import peter.finalprojectparallel.dto.ChannelDto;
import peter.finalprojectparallel.service.ChannelService;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class ChannelControllerTest {

    @Mock
    ChannelService channelService;

    @InjectMocks
    ChannelController channelController;

    @Test
    public void createChannel() {

    }

    @Test
    public void getAllChannels() {

    }

    @Test
    public void getChannelById() {

    }

    @Test
    public void deleteChannel() {

    }

    @Test
    public void addUserToChannel() {

    }
}
