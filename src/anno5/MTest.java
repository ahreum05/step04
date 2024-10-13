package anno5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
				new GenericXmlApplicationContext("anno5/bean.xml");
		
		MyMessage message1 = (MyMessage) context.getBean("myMessage");
		System.out.println(message1.getMessage());
		System.out.println(message1);
		System.out.println("---------------------");
		
		MyMessage message2 = (MyMessage) context.getBean("myMessage");
		System.out.println(message2.getMessage());
		System.out.println(message2);
		System.out.println("---------------------");
		
		context.close();
	}
}
