package Design_Patterns.FactoryDesignPattern;
import java.util.*;

/*Factory pattern is used when we need to instantiate the object based on some condition */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Notification o;
		FactoryClass factoryObject = new FactoryClass();
		
		o = factoryObject.getObject(str);
		o.Notify();
		
		sc.close();

	}

}
