package stealthchat.backend.chatting.model;

import stealthchat.backend.model.Group;
import stealthchat.backend.model.User;

import java.util.Date;

public class Message {

    private User sourceUser;
    private User receiveUser;
    private Group receiveGroup;
    private String message;
    private Date date;

    public Message() {
    }

    public Message(User sourceUser, User receiveUser, Group receiveGroup, String message, Date date) {
        this.sourceUser = sourceUser;
        this.receiveUser = receiveUser;
        if (receiveGroup != null) {
            this.receiveGroup = receiveGroup;
        }
        this.message = message;
        this.date = date;
    }

    public User getSourceUser() {
        return sourceUser;
    }

    public void setSourceUser(User sourceUser) {
        this.sourceUser = sourceUser;
    }

    public User getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(User receiveUser) {
        this.receiveUser = receiveUser;
    }

    public Group getReceiveGroup() {
        return receiveGroup;
    }

    public void setReceiveGroup(Group receiveGroup) {
        this.receiveGroup = receiveGroup;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
