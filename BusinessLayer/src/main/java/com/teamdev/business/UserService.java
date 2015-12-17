package com.teamdev.business;

public interface UserService<User> {

    void register(User user);

    void changePassword(User user);
}
