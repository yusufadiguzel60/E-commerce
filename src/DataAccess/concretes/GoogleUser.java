package DataAccess.concretes;

import DataAccess.abstracts.GoogleUserDao;

public class GoogleUser implements GoogleUserDao {
    @Override
    public void add(Entities.Concretes.GoogleUser googleUser) {
        System.out.println(googleUser.getGoogleUserNameAndSurname() + " adlı kullanıcı google üyeliği ile eklendi");
    }

    @Override
    public void remove(Entities.Concretes.GoogleUser googleUser) {
        System.out.println(googleUser.getGoogleUserNameAndSurname() + " adlı kullanıcı google üyeliği ile eklenemedi");
    }
}
