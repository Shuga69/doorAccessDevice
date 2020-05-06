package com.shuhai.device.view;

import java.util.LinkedHashMap;

public class DoorAccessDeviceSettingsMenu extends Menu {
    public DoorAccessDeviceSettingsMenu() {
        this.mainMenu = new LinkedHashMap<>();
        mainMenu.put("1","1 - Add face to white list.");
        mainMenu.put("2","2 - Delete face from white list.");
        mainMenu.put("Q","Q - Exit");
        this.methodsMenu = new LinkedHashMap<>();
//        methodsMenu.put("1", this::whiteList);
//        methodsMenu.put("2", this::settings);
    }

}
