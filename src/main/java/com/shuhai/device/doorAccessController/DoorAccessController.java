package com.shuhai.device.doorAccessController;

import com.shuhai.device.model.AccessDevice;
import com.shuhai.tool.Tool;

public class DoorAccessController extends DeviceController implements AccessController {

    public void isPasswordCorrect(AccessDevice accessDevice) {
       accessDevice.setPasswordCorrect(accessDevice.getPassword().equals(Tool.scanner.nextLine()));
    }
}
