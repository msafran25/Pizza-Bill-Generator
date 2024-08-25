class DulexPizza extends Pizza {
    private int dulexPizzaprice;
//    private int addExtraCheese = 100;
//    private int addExtraTopping = 70;
//    private int takeAway = 30;
    private  String dulex;
//    private String chicPizza;
    private boolean dulexPizza;

    public DulexPizza(boolean veg, boolean dulexPizza) {
        super(veg);
        this.dulexPizza = dulexPizza;
        if (this.dulexPizza){
            this.dulexPizzaprice = 500;
            this.dulex = "Dulex Bass,";
            System.out.print(dulex);
        } else {
            this.dulexPizzaprice = 560;
            this.dulex = "Dulex Supper,";
            System.out.print(dulex);
        }
    }
    public void pizzaPrice(){

        System.out.println( " Dulex Pizza Price: "+ dulexPizzaprice);
    }

    public void extraCheesePrice(){
        System.out.println("Extra Cheese added: "+ addExtraCheese);
        this.dulexPizzaprice  += addExtraCheese;

    }


    public void extraToppingPrice(){
        System.out.println("Extra Topping added: " + addExtraTopping);
        this.dulexPizzaprice += addExtraTopping;
    }

    public void takeAwayPrice(){
        System.out.println("Takeaway Packaging added: " + takeAway);
        this.dulexPizzaprice += takeAway;
        System.out.println("Total : " + dulexPizzaprice);
    }
}
