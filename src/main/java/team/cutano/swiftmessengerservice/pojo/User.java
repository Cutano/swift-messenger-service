package team.cutano.swiftmessengerservice.pojo;

public class User {
    private Long userID;
    private String username;
    private String avatar;
    private String password;

    public User(Long userID, String username, String avatar, String password) {
        this.userID = userID;
        this.username = username;
        this.avatar = avatar;
        this.password = password;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
