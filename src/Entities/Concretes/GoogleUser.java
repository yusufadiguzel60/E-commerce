package Entities.Concretes;

public class GoogleUser {

    private long googleUserId;
    private String googleUserNameAndSurname;
    private String googleUserEmail;
    private String googleUserPassword;

    public GoogleUser() {}

    public GoogleUser(long googleUserId, String googleUserNameAndSurname, String googleUserEmail, String googleUserPassword) {
        super();
        this.googleUserId = googleUserId;
        this.googleUserNameAndSurname = googleUserNameAndSurname;
        this.googleUserEmail = googleUserEmail;
        this.googleUserPassword = googleUserPassword;
    }


    public long getGoogleUserId() {
        return googleUserId;
    }

    public void setGoogleUserId(long googleUserId) {
        this.googleUserId = googleUserId;
    }

    public String getGoogleUserNameAndSurname() {
        return googleUserNameAndSurname;
    }

    public void setGoogleUserNameAndSurname(String googleUserNameAndSurname) {
        this.googleUserNameAndSurname = googleUserNameAndSurname;
    }

    public String getGoogleUserEmail() {
        return googleUserEmail;
    }

    public void setGoogleUserEmail(String googleUserEmail) {
        this.googleUserEmail = googleUserEmail;
    }

    public String getGoogleUserPassword() {
        return googleUserPassword;
    }

    public void setGoogleUserPassword(String googleUserPassword) {
        this.googleUserPassword = googleUserPassword;
    }
}
