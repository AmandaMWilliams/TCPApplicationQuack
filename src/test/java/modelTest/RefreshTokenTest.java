package modelTest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import peter.finalprojectparallel.model.RefreshToken;

import java.time.Instant;

public class RefreshTokenTest {

    @Test
    public void refreshTokenNullConstructorTest() {
        //given
        RefreshToken test = new RefreshToken();
        //when
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void refreshTokenOLConstructorTest() {
        //given
        RefreshToken test = new RefreshToken();
        Long testId = 357L;
        String testToken = "5fs6a4fdsfsa654";
        Instant testTime = Instant.now();
        //when
        test.setId(testId);
        test.setToken(testToken);
        test.setCreatedDate(testTime);
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getTokenIdTest() {
        //given
        RefreshToken test = new RefreshToken();
        Long expected = 45678L;
        //when
        test.setId(expected);
        Long actual = test.getId();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getTokenTest() {
        //given
        RefreshToken test = new RefreshToken();
        String expected = "328yhiofns98gjseww0";
        //when
        test.setToken(expected);
        String actual = test.getToken();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCreatedDateTest() {
        //given
        RefreshToken test = new RefreshToken();
        Instant expected = Instant.now();
        //when
        test.setCreatedDate(expected);
        Instant actual = test.getCreatedDate();
        //then
        Assertions.assertEquals(expected, actual);
    }
}
