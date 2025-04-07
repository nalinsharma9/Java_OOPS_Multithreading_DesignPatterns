package Design_Patterns.DecoratorDesignPattern;

public class ExtraMilk extends CoffeeDecorator{

    public ExtraMilk(Coffee coffee){
        super.coffee = coffee;
    }

    public int getCost(){
        return coffee.getCost() + 10;
    }
}
