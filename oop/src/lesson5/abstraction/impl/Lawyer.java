package lesson5.abstraction.impl;

import lesson5.abstraction.interfaces.iusers.IUser;
import lesson5.abstraction.interfaces.iusers.OtherOperations;

public class Lawyer implements IUser, OtherOperations {
    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getEmail() {
        return "";
    }

    @Override
    public void restPassword(String password) {

    }

    @Override
    public void checkStatus() {

    }
}
