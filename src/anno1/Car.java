package anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// <bean id="car" class="anno1.Car">
//		<property name="tire" ref="test"/>
// </bean> 와 동일한 설정
@Component
public class Car {
	// @Autowired : setter를 통해서 bean 객체를 주입시키는 명령어
	//			=> 우리가 setter를 만들 필요는 없음
	@Autowired
	private Tire tire;
	
	public void drive() {
		System.out.println(tire.getBrand() + "로 만들어진 국산 자동차");
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
}	
