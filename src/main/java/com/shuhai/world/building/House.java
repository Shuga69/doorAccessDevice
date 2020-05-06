package com.shuhai.world.building;

import com.shuhai.device.model.Device;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<String> inhabitant;
    private List<String> rooms;
    private List<Device> devices;
    private String houseName;

    public House(List<Device> devices, String houseName) {
        this.devices = devices;
        this.houseName = houseName;
    }

    public House(String houseName) {
        this.houseName = houseName;
        devices = new ArrayList<>();
    }

    public House(List<String> inhabitant, String houseName, List<String> rooms, List<Device> devices) {
        this.inhabitant = inhabitant;
        this.rooms = rooms;
        this.devices = devices;
        this.houseName = houseName;
    }

    public List<String> getInhabitant() {
        return inhabitant;
    }

    public List<String> getRooms() {
        return rooms;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getHouseName() {
        return houseName;
    }
}
