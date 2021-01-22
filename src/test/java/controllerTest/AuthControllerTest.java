package controllerTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import peter.finalprojectparallel.controller.AuthController;
import peter.finalprojectparallel.controller.ChannelController;
import peter.finalprojectparallel.dto.AuthenticationResponse;
import peter.finalprojectparallel.dto.LoginRequest;
import peter.finalprojectparallel.dto.RefreshTokenRequest;
import peter.finalprojectparallel.dto.RegisterRequest;
import peter.finalprojectparallel.service.AuthService;
import peter.finalprojectparallel.service.ChannelService;

import javax.validation.Valid;

public class AuthControllerTest {

    @Mock
    AuthService authService;

    @InjectMocks
    AuthController authController;


    @Test
    public void signup() {

    }

    @Test
    public void verifyAccount() {

    }

    @Test
    public void login() {

    }

    @Test
    public void refreshTokens() {

    }

    @Test
    public void logout() {

    }
}
