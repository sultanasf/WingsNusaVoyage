package test;

import helper.Auth;
import java.util.ArrayList;
import models.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        User user1 = new Admin("Sultan", "Firdaus", "081234567890", "sultanfirdaus324@gmail.com", "tanfi2514");
        User user2 = new Customer("Sultan", "Firdaus", "081234567890", "sultanfirdaus324@gmail.com", "tanfi2514");
        users.add(user1);
        users.add(user2);

        System.out.println(Auth.login("sultanfirdaus324@gmail.com", "tanfi2514", users));
        System.out.println(Auth.checkRole(users.get(0)));
    }
}
