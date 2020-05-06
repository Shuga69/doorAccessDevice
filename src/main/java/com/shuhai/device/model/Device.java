package com.shuhai.device.model;

public abstract class Device {
    private boolean isTurnOn;

    public String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void setTurnOn(boolean turnOn) {
        isTurnOn = turnOn;
    }
}
