package studios.chapter4studio.Restaurant;

public class MenuItems {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean newItem;

    public MenuItems(String name, String description, String category, double price, boolean newItem){
        this.name=name;
        this.price=price;
        this.description=description;
        this.category=category;
        this.newItem=newItem;


    }
    public MenuItems (String name, String description, String category){
        this(name, description, category, 0.00, false);
    }

//    getters and setters
    public String getName(){ return this.name; }
    public void setName(String itemName){ this.name=itemName;  }

    public double getPrice(){ return this.price; }
    public void setPrice(double itemPrice){ this.price=itemPrice;  }

    public String getDescription(){ return this.description; }
    public void setDescription(String itemDescription){ this.description=itemDescription;  }

    public String getCategory(){ return this.category; }
    public void setCategory(String categoryOfItem){ this.category=categoryOfItem;  }

    public boolean getNewItem(){ return this.newItem; }
    public void setNewItem(boolean aNewItem){ this.newItem=aNewItem;  }
}
