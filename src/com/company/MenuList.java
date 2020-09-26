package com.company;

public class MenuList {
    private Menu[] list;
    private int maxCount = -1;

    public Menu[] getMenuList(){
        if(!isMenuLoaded())
            load();

        return list;
    }

    public Menu choose(int index){
        if(maxCount < 0) load();
        if(index > maxCount || index < 0) return null;

        return list[index];
    }

    private void load(){
        maxCount = 5;
        list = new Menu[maxCount];
        list[0] = new Menu();
        list[1] = new Menu();
        list[2] = new Menu();
        list[3] = new Menu();
        list[4] = new Menu();
    }

    private boolean isMenuLoaded(){
        return maxCount >= 0;
    }
}
