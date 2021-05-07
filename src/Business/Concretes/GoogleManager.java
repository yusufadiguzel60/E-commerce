package Business.Concretes;

import Business.Abstracts.GoogleUserManagerDao;
import Entities.Concretes.GoogleUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleManager implements GoogleUserManagerDao {

    boolean checkUserMailAndPassword = false;
    boolean checkUserAgainMail = false;
    boolean checkUserNameAndSurname = false;
    boolean login = false;



    @Override
    public boolean CheckUserMailAndPassword(GoogleUser googleUseruser) {

        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(googleUseruser.getGoogleUserEmail());

        if (googleUseruser.getGoogleUserPassword().length() > 6 && matcher.find()) {
            checkUserMailAndPassword = true;
        }else{
            checkUserMailAndPassword = false;
        }
        return checkUserMailAndPassword;
    }

    @Override
    public boolean CheckUserNameAndSurname(GoogleUser googleUseruser) {
        if (googleUseruser.getGoogleUserNameAndSurname().length() > 2) {
            checkUserNameAndSurname = true;
        }else {
            checkUserNameAndSurname = false;
        }
        return checkUserNameAndSurname;
    }

    @Override
    public boolean HasInSystem(GoogleUser googleUseruser) {
        if (googleUseruser.getGoogleUserEmail().isEmpty()){
            checkUserAgainMail = true;
        }else {
            checkUserAgainMail = false;
        }
        return checkUserAgainMail;
    }

    @Override
    public void CheckValidationButtonIsClick(GoogleUser googleUseruser) {
        String message = "tıkla";

        if (message == "tıkla") {
            System.out.println(googleUseruser.getGoogleUserNameAndSurname() + " adlı kullanıcının üyeliği tamamalanmıştır!");
        }else {
            System.out.println("Lütfen butona tıklayınız!");
        }
    }
    @Override
    public void Register(GoogleUser googleUseruser) {
        if (checkUserMailAndPassword == true && checkUserNameAndSurname == true && checkUserAgainMail == false) {
            System.out.println(googleUseruser.getGoogleUserNameAndSurname() + " adlı kullanıcıya e-posta gönderildi!");
            login = true;
        } else {
            System.out.println(googleUseruser.getGoogleUserNameAndSurname() + " adlı kullanıcıya e-posta gönderilemedi!");
            login = false;
        }
    }

    @Override
    public void Login(GoogleUser googleUseruser) {
        if (login) {
            System.out.println("Giriş yapıldı");
        }else {
            System.out.println("Giriş yapılamadı");
        }
    }
}
