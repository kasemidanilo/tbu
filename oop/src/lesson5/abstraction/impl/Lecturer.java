package lesson5.abstraction.impl;

import lesson5.abstraction.interfaces.iusers.EditingLessons;
import lesson5.abstraction.interfaces.iusers.IUser;
import lesson5.abstraction.interfaces.iusers.OtherOperations;
import lesson5.abstraction.interfaces.iusers.ViewLesson;

import java.util.List;

public class Lecturer implements IUser, ViewLesson, EditingLessons, OtherOperations {

    private String fullName;
    private List<String> subjects;

    @Override
    public void uploadLesson() {

    }

    @Override
    public void editLesson() {

    }

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

    @Override
    public void viewLesson() {

    }
}
