package Design_Patterns.FactoryDesignPattern;

public class FactoryClass {
	public Notification getObject(String str) {
		Notification o;
		if(str.equals("EMAIL")) {
			o = new EmailNotification();
			return o;
		}
		else
		{
			o = new PushNotification();
			return o;
		}
			
	}

}
