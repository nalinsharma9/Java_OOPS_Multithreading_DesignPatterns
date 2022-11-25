package Design_Patterns.FactoryDesignPattern;

public class FactoryClass {
	public Notification getObject(String str) {
		if(str.equals("EMAIL")) {
			Notification o = new EmailNotification();
			return o;
		}
		else
		{
			Notification o = new PushNotification();
			return o;
		}
			
	}

}
