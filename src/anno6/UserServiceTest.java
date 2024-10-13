package anno6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServiceTest {
	public static void main(String[] args) {
		// @Configuration를 사용할 경우
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		context.scan("anno6");
		context.refresh();
		
		UserService user = context.getBean(UserServiceImpl.class);
		user.show();
		
		context.close();
	}
}
