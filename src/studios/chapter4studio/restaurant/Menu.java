package studios.chapter4studio.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
//    class variables
    private Date lastUpdated;
    private MenuItems[] menuItem;


//constructors
    public Menu (Date lastUpdated, MenuItems[] menuItem){
        this.lastUpdated=lastUpdated;
        this.menuItem =menuItem;
    }
//methods
    public Date getLastUpdated(){ return this.lastUpdated;}
    public void setLastUpdated(Date wasLastUpdated){ this.lastUpdated=wasLastUpdated;}

    public MenuItems[] getMenuItem(){ return this.menuItem;}
    public void setMenuItem(MenuItems[] menuItem){ this.menuItem = menuItem;}

//    public void addMenuItem (MenuItems[] menuItem){
//        MenuItems[] listOfMeuItems=new MenuItems[]<>();
//        listOfMeuItems.add(menuItem);
//        this.lastUpdated=new Date();

//    }
//    public void removeMenuItems (MenuItems[] menuItem){
//        ArrayList<String> listOfMeuItems=new ArrayList<>();
//        listOfMeuItems.add(menuItem);
//        this.lastUpdated=new Date();

//    }
}
