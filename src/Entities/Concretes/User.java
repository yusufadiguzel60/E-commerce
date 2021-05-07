package Entities.Concretes;

public class User {

    private long userId;
    private String userNameAndSurname;
    private String userEmail;
    private String userPassword;

    public User() {

    }

    public User(long userId, String userNameAndSurname, String userEmail, String userPassword) {
        this.userId = userId;
        this.userNameAndSurname = userNameAndSurname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userNameAndSurname;
    }

    public void setUserName(String userNameAndSurname) {
        this.userNameAndSurname = userNameAndSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
