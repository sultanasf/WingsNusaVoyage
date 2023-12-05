package models;
import models.implementations.UserImp;
public class Admin extends UserImp {

    public Admin(String username, String password ) {
        super(username, password, "admin");
    }

}
