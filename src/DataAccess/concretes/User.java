package DataAccess.concretes;

import DataAccess.abstracts.UserDao;

public class User implements UserDao {


    @Override
    public void Add(Entities.Concretes.User user) {
        System.out.println(user.getUserName() + " adlı kullanıcı eklendi");
    }

    @Override
    public void Remove(Entities.Concretes.User user) {
        System.out.println(user.getUserName() + " adlı kullanıcı eklenemedi");
    }
}
