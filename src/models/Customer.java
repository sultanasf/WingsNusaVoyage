
package models;
import models.implementations.UserImp;
import java.util.ArrayList;

public class Customer extends UserImp{
    
    private String email;
    private String noTelp;
    private Cart cart;
    
    public Customer(String username, String password) {
        super(username, password, "customer");
        this.cart = new Cart();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
    public Cart getCart() {
        return this.cart;
    }
    
}
