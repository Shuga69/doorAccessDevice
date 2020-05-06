package com.shuhai.device.model;

public interface AccessDevice {
    String getPassword();
    void setPassword(String password);
    boolean isPasswordCorrect();
    void setPasswordCorrect(boolean passwordCorrect);
}
