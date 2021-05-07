package Business.Concretes;

import Business.Abstracts.UserManagerDao;
import Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserManagerDao {

    boolean checkUserMailAndPassword = false;
    boolean checkUserAgainMail = false;
    boolean checkUserNameAndSurname = false;
    boolean login = false;


    @Override
    public void Login(User user) {
        if (login) {
            System.out.println("Giriş yapıldı");
        }else {
            System.out.println("Giriş yapılamadı");
        }
    }

    @Override
    public boolean CheckUserMailAndPassword(User user) {

        Pattern pattern = Pattern.compile("@");
        Matcher matcher = pattern.matcher(user.getUserEmail());

        if (user.getUserPassword().length() > 6 && matcher.find()) {
            checkUserMailAndPassword = true;
        }else{
            checkUserMailAndPassword = false;
        }
        return checkUserMailAndPassword;
    }

    @Override
    public boolean CheckUserNameAndSurname(User user) {
        
        if (user.getUserName().length() > 2) {
            checkUserNameAndSurname = true;
        }else {
            checkUserNameAndSurname = false;
        }
        return checkUserNameAndSurname;
    }

    @Override
    public boolean HasInSystem(User user) {
        if (user.getUserEmail().isEmpty()){
            checkUserAgainMail = true;
        }else {
            checkUserAgainMail = false;
        }
        return checkUserAgainMail;
    }


    @Override
    public void CheckValidationButtonIsClick(User user) {
        String message = "tıkla";

        if (message == "tıkla") {
            System.out.println(user.getUserName() + " adlı kullanıcının üyeliği tamamalanmıştır!");
        }else {
            System.out.println("Lütfen butona tıklayınız!");
        }
    }

    @Override
    public void Register(User user) {
        
        if (checkUserMailAndPassword == true && checkUserNameAndSurname == true && checkUserAgainMail == false) {
            System.out.println(user.getUserName() + " adlı kullanıcıya e-posta gönderildi!");
            login = true;
        } else {
            System.out.println(user.getUserName() + " adlı kullanıcıya e-posta gönderilemedi!");
            login = false;
        }
    }
}
