package stealthchat.backend.groups.model;

import stealthchat.backend.model.Group;
import stealthchat.backend.model.User;

public class UserGroupRequest {

    private int requestId;
    private User user;
    private Group group;

    public UserGroupRequest() {
    }

    public UserGroupRequest(int requestId, User user, Group group) {
        this.requestId = requestId;
        this.user = user;
        this.group = group;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
