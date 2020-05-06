package com.shuhai.device.doorAccessController;

import com.shuhai.device.model.Device;

public abstract class DeviceController {
   public void turnOn(Device device){
        device.setTurnOn(true);
    }
    public void turnOff(Device device){
        device.setTurnOn(false);
    }
}
