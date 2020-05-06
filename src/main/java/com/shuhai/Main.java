package com.shuhai;

import com.shuhai.device.model.Device;
import com.shuhai.device.model.DoorAccessDevice;
import com.shuhai.device.view.MainMenu;
import com.shuhai.world.building.House;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        DoorAccessDevice doorAccess = new DoorAccessDevice();
        devices.add(doorAccess);
        House shuhai = new House(devices,"Shuhai");
        House velihurski = new House("Velihurski");
        ArrayList<House> houses = new ArrayList<>();
        houses.add(shuhai);
        houses.add(velihurski);
        MainMenu menu = new MainMenu(houses);
        menu.show();
    }
}
