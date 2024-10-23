package com.bootcamp.dio.dto;

public class UserDTO {

    private String username;
    private String password;
    private int xp;

    public UserDTO () {}

    UserDTO userDTO = new UserDTO ("user", "password");

    public UserDTO(String username, String password, String email, int xp) {
        this.username = username;
        this.password = password;
        this.xp = xp;
    }

    public UserDTO(String user, String password) {

    }

    public UserDTO(String username, int xp) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
