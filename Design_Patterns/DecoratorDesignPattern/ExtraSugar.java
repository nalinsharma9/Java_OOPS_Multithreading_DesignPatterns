package Design_Patterns.DecoratorDesignPattern;

public class ExtraSugar extends CoffeeDecorator{
    private Coffee coffee;

    public ExtraSugar(Coffee coffee){
        this.coffee = coffee;
    }

    public int getCost(){
        return coffee.getCost() + 5;
    }

}
