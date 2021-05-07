package DataAccess.abstracts;

import Entities.Concretes.User;

public interface UserDao {

    void Add(User user);
    void Remove(User user);

}
