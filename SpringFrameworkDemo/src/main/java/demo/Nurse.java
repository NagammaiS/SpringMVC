package demo;

import org.springframework.stereotype.Component;

@Component(value="nurse33")
public class Nurse implements Staff {
public void assist () {
	System.out.println("Nurse is assisiting");
}
}
