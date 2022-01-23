package afterSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")//default name is car == > first letter small this is default 
public class Car implements Vehicle{
	@Autowired  //used for objects 
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car drive" +tyre);
	}

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}

}
