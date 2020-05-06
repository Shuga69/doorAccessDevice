package com.shuhai.device.model;

import com.shuhai.world.people.People;

import java.util.ArrayList;
import java.util.List;

public class DoorAccessDevice extends Device implements AccessDevice {
    private String password;
    private List<People> registerPeople = new ArrayList<>();
    private boolean isPasswordCorrect;
    private String deviceName = "Access device";

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    public boolean isPasswordCorrect() {
        return isPasswordCorrect;
    }

    public void setPasswordCorrect(boolean passwordCorrect) {
        isPasswordCorrect = passwordCorrect;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<People> getRegisterPeople() {
        return registerPeople;
    }

    public void setRegisterPeople(List<People> registerPeople) {
        this.registerPeople = registerPeople;
    }
}
