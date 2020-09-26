package com.company;

public class StoreManager {
    // 음식 만드는 객체도 있으면 좋을듯!

    public MenuList getMenuList(){
        return new MenuList();
    }

    public Food getFood(Menu menu){
        return new Food();
    }

    boolean submitTicket(Ticket ticket){

        return true;
    }

    private boolean canMakeTheFood(Menu menu){
        if(menu == null)
            return false;

        // 음식 만드는 객체한테 검증
        return true;
    }
}
