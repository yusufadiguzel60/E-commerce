package DataAccess.abstracts;

import Entities.Concretes.GoogleUser;

public interface GoogleUserDao {

    void add(GoogleUser googleUser);
    void remove(GoogleUser googleUser);

}
