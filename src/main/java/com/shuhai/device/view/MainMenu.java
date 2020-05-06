package com.shuhai.device.view;

import com.shuhai.device.model.Device;
import com.shuhai.world.building.House;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MainMenu extends Menu {
    ArrayList<House> houses;

    public MainMenu(ArrayList<House> houses) {
        this.houses = houses;
        this.mainMenu = new LinkedHashMap<>();
        mainMenu.put("0"," Buildings");
        for (int i = 1; i <= houses.size(); i++) {
            mainMenu.put(Integer.toString(i),i+" - "+houses.get(--i).getHouseName());
            ++i;
        }
        mainMenu.put("Q","Q - Exit");
        this.methodsMenu = new LinkedHashMap<>();
        for (int i = 1; i <= houses.size(); i++) {
            methodsMenu.put(Integer.toString(i), this::houseMenu);
        }

    }
    public void houseMenu(){
        HouseMenu houseMenu = new HouseMenu(houses.get(Integer.parseInt(Menu.keyMenu)-1).getDevices());
        houseMenu.show();

    }
}
