
package models.interfaces;

public interface User {
    String getUsername();
    String getPassword();
    void setUsername(String username);
    void setPassword(String password);
    String role();
}