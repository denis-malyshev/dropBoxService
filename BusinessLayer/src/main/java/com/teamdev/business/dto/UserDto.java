package com.teamdev.business.dto;

public class UserDto {

    private long id;
    private String firstName;
    private String mail;

    public UserDto() {
    }

    public UserDto(long id, String firstName, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
