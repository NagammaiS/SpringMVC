package afterSpring;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
private String brand;
public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String toString() {
	return "its working";
}
}
