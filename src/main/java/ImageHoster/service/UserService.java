package com.upgrad.ImageHoster.service;

public interface UserService {
    User login(String username, String password);

    User getByName(String username);

    User getByNameWithProfilePhoto(String username);

    boolean register(User user);

    void update(User user);
}
