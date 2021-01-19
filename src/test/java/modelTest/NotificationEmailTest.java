package modelTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import peter.finalprojectparallel.model.NotificationEmail;

public class NotificationEmailTest {

    @Test
    public void notificationEmailNullConstructorTest() {
        //given
        NotificationEmail test = new NotificationEmail();
        //when
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void notificationEmailOLConstructorTest() {
        //given
        NotificationEmail test = new NotificationEmail();
        String testSubject = "Subject of the email";
        String testRecipientAddress = "PeteK@zipcode.com";
        String testBody = "Hi, Pete!";
        //when
        test.setSubject(testSubject);
        test.setRecipientAddress(testRecipientAddress);
        test.setBody(testBody);
        //then
        Assertions.assertNotNull(test);
    }

    @Test
    public void getSubjectTest() {
        //given
        NotificationEmail notificationEmail = new NotificationEmail();
        String expected = "Test email subject";
        //when
        notificationEmail.setSubject(expected);
        String actual = notificationEmail.getSubject();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getRecipientAddressTest() {
        //given
        NotificationEmail notificationEmail = new NotificationEmail();
        String expected = "Oberg@zipcode.com";
        //when
        notificationEmail.setRecipientAddress(expected);
        String actual = notificationEmail.getRecipientAddress();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBodyTest() {
        //given
        NotificationEmail notificationEmail = new NotificationEmail();
        String expected = "This is the body of the notification email.";
        //when
        notificationEmail.setBody(expected);
        String actual = notificationEmail.getBody();
        //then
        Assertions.assertEquals(expected, actual);
    }

}
