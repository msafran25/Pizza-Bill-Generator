public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(true);
        pizza.pizzaPrice();
        pizza.extraCheesePrice();
        pizza.extraToppingPrice();
        pizza.takeAwayPrice();

        DulexPizza dp = new DulexPizza(false,false);
        dp.pizzaPrice();
        dp.extraCheesePrice();
        dp.extraToppingPrice();
        dp.takeAwayPrice();
    }
}