package studios.chapter4studio.Restaurant;

import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private MenuItems myMenuItem;

    public Menu (Date lastUpdated, MenuItems myMenuItem){
        this.lastUpdated=lastUpdated;
        this.myMenuItem=myMenuItem;
    }

    public Date getLastUpdated(){ return this.lastUpdated;}
    public void setLastUpdated(Date wasLastUpdated){ this.lastUpdated=wasLastUpdated;}

    public MenuItems getMyMenuItem(){ return this.myMenuItem;}
    public void setMyMenuItem(MenuItems myMenuItem){ this.myMenuItem=myMenuItem;}
}
