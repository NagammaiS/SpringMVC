package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


//CAN BE USED WITH XML AND HAVING EMPTY CLASS WITHOUT BEAN DEFINITION 
//CAN BE USED FOR JAVA CONFIGURATION WITH THE BEAN CLASS 

//@ComponentScan(basePackages = "demo")//similiar to <context:component-scan base-package="demo">
//@ComponentScan(basePackageClasses = {Doctor.class,Nurse.class}) 
//@ComponentScan("Doctor")/("Nurse")
@Configuration
public class BeanConfig {

	
	// similiar to <bean class="" id="">
	@Bean(value="doctor")
	@Scope(scopeName = "singleton")//can be used here for scope or else use on top of doctor class
	public Doctor doctor(){
		return new Doctor();
	}
	
	@Bean (value="nurse1")//@Bean(name=nurse1)
	@Scope("prototype")
	public Nurse nurse() {
		return new Nurse();
	}
	
}
//Types : 
// only xml with bean tag (spring.xml alone)
//xml with component scan and java annotations in package classes (spring.xml and annotations in doctor and nurse)
//1)java configuration with @Bean annotation and @configuration annotation and @component in doctor and nurse  without component scan
//2)java configuration and annotations (annotations in nurse and doctor and this file with component scan and this empty class)
 