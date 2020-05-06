package com.shuhai.world.people;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class People {
    private String firstName;
    private String secondName;
    private String sex;
    private HashMap<String,String> facialFeatures;

    public String getFirstName() {
        return firstName;
    }

    public void setFacialFeatures(HashMap<String, String> facialFeatures) {
        this.facialFeatures = facialFeatures;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSex() {
        return sex;
    }

    public People() {
        this.facialFeatures = new LinkedHashMap<String, String>();
    }
}
