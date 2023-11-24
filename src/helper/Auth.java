package helper;

import java.util.ArrayList;

import models.Admin;
import models.Customer;
import models.implementations.UserImp;

public class Auth {
    // TODO: Implement logic to authenticate user (Admin/Customer)

    public static boolean login(String username, String password, ArrayList<UserImp> users) {
        for (UserImp user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static int checkRole(UserImp user) {
        if (user instanceof Admin) {
            return 2;
        } else if (user instanceof Customer) {
            return 1;
        } else {
            return 0;
        }
    }
}
