package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="doctor")
//@Scope(scopeName = "prototype")
//default name of bean is class name with decapitalized first letter 
//-----doctor , (Doctor)ctx.getBean("doctor");
public class Doctor implements Staff ,BeanNameAware{

	private String qualification;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void assist() {
	System.out.println("Doctor is assiting");
	}
	
	@Override
	public String toString() {
		return "Doctor [qualification=" + qualification + "]";
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean name is Doctor");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post construct method is called");
	}
}
