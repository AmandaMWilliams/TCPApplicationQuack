package peter.finalprojectparallel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Channel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long channelId;
    @NotBlank(message = "Channel name is required")
    private String channelName;
    @NotBlank(message = "Channel description is required")
    private String description;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Message> messageList;
    private Instant created;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToMany(mappedBy = "subscribedChannels", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Collection<User> subscribedUsers;

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<User> getSubscribedUsers() {
        return subscribedUsers;
    }

    public void setSubscribedUsers(Collection<User> subscribedUsers) {
        this.subscribedUsers = subscribedUsers;
    }
}
