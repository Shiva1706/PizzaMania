package bill;

public class DeluxePizza extends pizza {

    public DeluxePizza(Boolean veg){
        super(veg);
    }


    @Override
    public void addExtraCheese(){
        this.price += extraCheesePrice;
    }

    @Override
    public void addExtraToppings(){
        this.price += extraToppingsPrice;
    }
}
