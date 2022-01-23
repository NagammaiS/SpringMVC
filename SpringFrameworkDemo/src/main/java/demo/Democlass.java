package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Democlass {
	public static void main(String args[]) {

		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		Staff d = context.getBean("nurse1",Nurse.class);
//		d.assist();
		Doctor doctor = (Doctor) context.getBean("doctor");
		doctor.assist();
		doctor.setQualification("MBBS");
		System.out.println(doctor);
		
		//singleton same object will be printed MBBS MBBS twice whole container same object 
		//if prototype is used MBBS and null is printed one object is mapped so different object is not there is so null
		//if here "science" is given then for third object null is printed 
		Doctor doctor1 = context.getBean(Doctor.class);
		System.out.println(doctor1);
	
		
		
	}	
}
