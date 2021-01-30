package studios.chapter4studio.restaurant;

public class MenuItems {
    private String description;
    private String category;
    private double price;
    private boolean isNew;
    private String name;

    public MenuItems (String name, String description, String category){
        this(name, description, category, 0.00, true);
    }
    public MenuItems(String name, String description, String category, double price, boolean newItem){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.isNew =newItem;
    }


//    getters and setters
    public String getName(){ return this.name; }
    public void setName(String name){ this.name=name;  }

    public double getPrice(){ return this.price; }
    public void setPrice(double price){ this.price=price;  }

    public String getDescription(){ return this.description; }
    public void setDescription(String description){ this.description=description;  }

    public String getCategory(){ return this.category; }
    public void setCategory(String category){ this.category=category;  }
//Restaurant Menu Studio methods continued
    public boolean isNew(){ return this.isNew; }
    public void setNew(boolean aNewItem){ this.isNew =aNewItem;  }

    @Override
    public String toString(){
        String returnString= "";
        returnString =  "Item name: "+this.name +"/n";
        returnString = "Item category: "+this.category +"/n";
        returnString = "Item description: "+this.description +"/n";
        returnString = "Item price: "+this.price +"/n";
        returnString = "Item is new?: "+this.isNew +"/n";
        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this) return true;
        if (!(obj instanceof MenuItems)) return false;
        MenuItems menuItems = (MenuItems) obj;
        if (menuItems.name.equals(this.name) && menuItems.description.equals(this.description) && menuItems.price.equals(this.price)&& menuItems.category.equals(this.category)) return true;
        else return false;
    }
}



