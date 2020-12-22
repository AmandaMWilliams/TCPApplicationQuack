package quack.finalproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    private String messageContent;
    private Date timeStamp;
    private Long senderId;
    private Long locationId;


    public Message() {
    }

    public Message(String messageContent, Date timeStamp, Long senderID, Long locationID) {
        this.messageContent = messageContent;
        this.timeStamp = timeStamp;
        this.senderId = senderId;
        this.locationId = locationId;
    }

    public Long getMessageID() {
        return messageId;
    }

    public void setMessageID(Long messageID) {
        this.messageId = messageId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getSenderID() {
        return senderId;
    }

    public void setSenderID(Long senderID) {
        this.senderId = senderId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Long getLocation() {
        return locationId;
    }

    public void setLocation(Long locationId) {
        this.locationId = locationId;
    }
}
