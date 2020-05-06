package com.shuhai.device.view;

import com.shuhai.tool.Tool;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Menu {
    public Map<String, String> mainMenu;
    public Map<String, Printable> methodsMenu;
    static String keyMenu;
    private void printMenu(){
        System.out.println("Menu:");
        for (String str: mainMenu.values()){
            System.out.println(str);
        }
    }
    public void show(){


        do {
            printMenu();
            keyMenu = Tool.scanner.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e){

                System.out.println("input exception");
            }
        }while (!keyMenu.equals("Q"));
    }
}
