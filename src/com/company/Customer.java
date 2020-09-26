package com.company;

public class Customer {
    private Internet internet;
    private StoreManager manager;
    private Device device;
    private Food food;

    public void order(){
        manager = new Store().join(this);
        MenuList menuList = manager.getMenuList();
        Menu m = menuList.choose(0);
        manager.getFood(m);
    }

    public void submit(){
        manager.submitTicket(load(device));
    }

    public void eat(){
        food.eat();
    }

    private Ticket load(Device device){
        return device.getTicket(internet);
    }

}
