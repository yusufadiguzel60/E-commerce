package Business.Abstracts;

import Entities.Concretes.GoogleUser;

public interface GoogleUserManagerDao {

    void Register(GoogleUser googleUseruser);

    void Login(GoogleUser googleUseruser);

    boolean CheckUserMailAndPassword(GoogleUser googleUseruser);

    boolean CheckUserNameAndSurname(GoogleUser googleUseruser);

    boolean HasInSystem(GoogleUser googleUseruser);

    void CheckValidationButtonIsClick(GoogleUser googleUseruser);

}
