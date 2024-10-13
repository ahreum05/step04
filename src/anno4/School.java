package anno4;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class School {
	@Autowired 
	private Student person;
	//@Autowired
	//@Qualifier("grade1")
	@Resource(name="grade1")
	private int grade;
	
	@Override
	public String toString() {
		return "ABC 고등학교 [학생정보=" + person + ", 학년=" + grade + "]";
	}  
	
}
