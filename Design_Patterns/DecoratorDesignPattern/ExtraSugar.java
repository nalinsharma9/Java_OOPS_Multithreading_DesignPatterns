package Design_Patterns.DecoratorDesignPattern;

public class ExtraSugar extends CoffeeDecorator{

    public ExtraSugar(Coffee coffee){
        super.coffee = coffee;
    }

    public int getCost(){
        return coffee.getCost() + 5;
    }

}
