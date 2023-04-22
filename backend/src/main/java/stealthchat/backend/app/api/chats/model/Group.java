package stealthchat.backend.app.api.chats.model;

import stealthchat.backend.model.User;

import java.util.ArrayList;

public class Group {

    private int groupId;
    private String groupName;
    private User admin;
    private ArrayList<User> users;

    public Group() {
    }

    public Group(int groupId, String groupName, User admin, ArrayList<User> users) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.admin = admin;
        this.users = users;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
