package pl.coderslab.entity;

import pl.coderslab.service.BCrypt;

public class Users {
    private int id;
    private String username;
    private String email;
    private String password;
    private int user_group_id;

    public Users(String username, String email, String password, int user_group_id) {
        this.username = username;
        this.email = email;
        this.setPassword(password);
        this.setUser_group_id(user_group_id);
    }

    public Users() {

    }


    private Users(int id, String username, String email, String password, UserGroup userGroup) {
        setId(id);
        setUsername(username);
        setEmail(email);
        this.password = password;
        setUser_group_id(user_group_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public int getUser_group_id() {
        return user_group_id;
    }

    public void setUser_group_id(int user_group_id) {
        this.user_group_id = user_group_id;
    }
}
