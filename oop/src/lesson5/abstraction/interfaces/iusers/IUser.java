package lesson5.abstraction.interfaces.iusers;

public interface IUser {

    String getUsername();
    String getPassword();
    String getEmail();

    void restPassword(String password);



}
