
package models.implementations;

import models.interfaces.Auth;
import models.interfaces.User;

public class UserImp implements User, Auth{
    
    private String username;
    private String password;
    private String role;
    
    public UserImp(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public String getUsername() {
       return this.username;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public String role() {
        return this.role;
        
    }

    @Override
    public boolean auth(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
