package Business.Abstracts;

import Entities.Concretes.User;

public interface UserManagerDao {
    void Register(User user);

    void Login(User user);

    boolean CheckUserMailAndPassword(User user);

    boolean CheckUserNameAndSurname(User user);

    boolean HasInSystem(User user);

    void CheckValidationButtonIsClick(User user);
}
