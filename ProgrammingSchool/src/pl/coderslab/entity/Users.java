package pl.coderslab.entity;

public class Users {
    private int id;
    private String username;
    private String email;
    private String password;
    private int user_group_id;

    public Users() {

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
        this.password = password;
    }

    public int getUser_group_id() {
        return user_group_id;
    }

    public void setUser_group_id(int user_group_id) {
        this.user_group_id = user_group_id;
    }
}
