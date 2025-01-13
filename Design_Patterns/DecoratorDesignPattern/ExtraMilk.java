package Design_Patterns.DecoratorDesignPattern;

public class ExtraMilk extends CoffeeDecorator{
    private Coffee coffee;

    public ExtraMilk(Coffee coffee){
        this.coffee = coffee;
    }

    public int getCost(){
        return coffee.getCost() + 10;
    }
}
