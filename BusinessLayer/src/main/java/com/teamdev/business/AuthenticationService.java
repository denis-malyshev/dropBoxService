package com.teamdev.business;

public interface AuthenticationService<AuthenticationToken, User> {

    void login(String mail, String password);

    void logout(AuthenticationToken token, User user);

    void isValid(AuthenticationToken token);
}
