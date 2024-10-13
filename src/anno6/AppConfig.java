package anno6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration이 붙은 클래스는 bean.xml 설정 파일을 대체함
@Configuration
public class AppConfig {
	// <bean id="myService" class="anno6.UserServiceImpl"/>
	@Bean
	public UserService myService() {
		return new UserServiceImpl();
	}
}
