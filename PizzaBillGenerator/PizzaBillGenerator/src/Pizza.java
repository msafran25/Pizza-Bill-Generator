public class Pizza {
   public int price;
    public boolean veg;
    public int addExtraCheese = 100;
    public int addExtraTopping = 70;
    public int takeAway = 30;
    public String vegPizza;
    public String chicPizza;
    public Pizza(boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 300;
           this.vegPizza = "Vege Pizza,";
            System.out.print(vegPizza);
        } else {
            this.price = 450;
            this.chicPizza = "Chicken Pizza,";
            System.out.print(chicPizza);
        }
    }

    public void pizzaPrice(){

        System.out.println( " Bass Pizza Price: "+ price);
    }

    public void extraCheesePrice(){
        System.out.println("Extra Cheese added: "+ addExtraCheese);
        this.price  += addExtraCheese;

    }


    public void extraToppingPrice(){
        System.out.println("Extra Topping added: " + addExtraTopping);
        this.price += addExtraTopping;
    }

    public void takeAwayPrice(){
        System.out.println("Takeaway Packaging added: " + takeAway);
        this.price += takeAway;
        System.out.println("Total : " + price);
        System.out.println(" ====Dulex Pizza====");
    }

}
