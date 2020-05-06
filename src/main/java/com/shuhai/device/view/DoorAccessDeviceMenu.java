package com.shuhai.device.view;

import com.shuhai.tool.Tool;

import java.util.LinkedHashMap;
import java.util.Map;

public class DoorAccessDeviceMenu extends Menu{
    public DoorAccessDeviceMenu() {
        this.mainMenu = new LinkedHashMap<>();
        mainMenu.put("1","1 - White list");
        mainMenu.put("2","2 - Settings");
        mainMenu.put("Q","Q - Exit");
        this.methodsMenu = new LinkedHashMap<>();
//        methodsMenu.put("1", this::whiteList);
//        methodsMenu.put("2", this::settings);
    }



}
