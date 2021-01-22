package controllerTest;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import peter.finalprojectparallel.controller.AuthController;
import peter.finalprojectparallel.service.AuthService;

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
