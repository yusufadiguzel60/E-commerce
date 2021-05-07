import Business.Abstracts.GoogleUserManagerDao;
import Business.Abstracts.UserManagerDao;
import Business.Concretes.GoogleManager;
import Business.Concretes.UserManager;
import Entities.Concretes.GoogleUser;
import Entities.Concretes.User;


public class Main {

    public static void main(String[] args) {
        User user = new User(1,"Yusuf","example@gmail.com","yusuf1234");
        GoogleUser googleUser = new GoogleUser(2,"Ahmet Ayşeoğlu","example1@gmail.com","asdasd");

        UserManagerDao managerDao = new UserManager();
        managerDao.CheckUserMailAndPassword(user);
        managerDao.CheckUserNameAndSurname(user);
        managerDao.Register(user);
        managerDao.Login(user);

        GoogleUserManagerDao managerDao1 = new GoogleManager();
        managerDao1.CheckUserMailAndPassword(googleUser);
        managerDao1.CheckUserNameAndSurname(googleUser);
        managerDao1.Register(googleUser);
        managerDao1.Login(googleUser);



    }
}
