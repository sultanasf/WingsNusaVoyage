package test;

import helper.Auth;
import java.util.ArrayList;
import models.*;
import models.implementations.AirlineImp;
import models.implementations.UserImp;

public class Test {
    public static void main(String[] args) {
        ArrayList<UserImp> users = new ArrayList<UserImp>();
        UserImp user1 = new Admin("admin", "admin");
        UserImp user2 = new Customer("customer", "customer");
//        AirlineImp lionAir = new Plane("boeing", "semarang", "blitar");
//        lionAir.setDestination("surabaya");
//        System.out.println(lionAir.getDestination());
//        users.add(user1);
//        users.add(user2);
//        if(user2 instanceof Customer) {
//            Customer customerUser = (Customer) user2;
//            customerUser.getCart().addCart(lionAir);
//            customerUser.getCart().addCart(lionAir);
//            System.out.println(customerUser.getCart().checkout(0));
//        }
    }
}