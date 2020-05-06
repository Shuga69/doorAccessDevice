package com.shuhai.device.view;

import com.shuhai.device.doorAccessController.DeviceController;
import com.shuhai.device.model.Device;
import com.shuhai.tool.Tool;
import com.shuhai.world.building.House;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HouseMenu extends Menu{
    List<Device> devices;
    public HouseMenu(List<Device> devices) {
        this.mainMenu = new LinkedHashMap<>();
        this.devices = devices;
        if (devices.isEmpty()){
            System.out.println("This is house haven't devices.");
            mainMenu.put("Q", "Q - Exit");
        }
        else {
            for (int i = 1; i <= devices.size(); i++) {
                mainMenu.put(Integer.toString(i), i + " - " + devices.get(--i).getDeviceName());
                ++i;
            }

            mainMenu.put("Q", "Q - Exit");
            this.methodsMenu = new LinkedHashMap<>();

            for (int i = 1; i <= devices.size(); i++) {
                methodsMenu.put(Integer.toString(i), this::deviceMenu);
            }
        }
    }
    private void deviceMenu(){
        if ("Access device".equals(devices.get(Integer.parseInt(Menu.keyMenu) - 1).getDeviceName())) {
            DoorAccessDeviceMenu doorAccessDeviceMenu = new DoorAccessDeviceMenu();
            doorAccessDeviceMenu.show();
        }

    }

}
