package helper;

import java.util.ArrayList;

import models.User;
import models.Admin;
import models.Customer;

public class Auth {
    // TODO: Implement logic to authenticate user (Admin/Customer)

    public static boolean login(String email, String password, ArrayList<User> users) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static int checkRole(User user) {
        if (user instanceof Admin) {
            return 2;
        } else if (user instanceof Customer) {
            return 1;
        } else {
            return 0;
        }
    }
}
