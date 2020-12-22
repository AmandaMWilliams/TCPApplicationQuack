package quack.finalproject.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long channelId;

    private Boolean isPrivate;
//    private Set<User> channelMembers;

    public Channel() {
    }

    public Channel(Boolean isPrivate, Set<User> channelMembers) {
        this.isPrivate = isPrivate;
//        this.channelMembers = channelMembers;
    }

    public Long getId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

//    public Set<User> getChannelMembers() {
//        return channelMembers;
//    }
//
//    public void setChannelMembers(Set<User> channelMembers) {
//        this.channelMembers = channelMembers;
//    }
}
