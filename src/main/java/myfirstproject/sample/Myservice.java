package myfirstproject.sample;

import org.springframework.stereotype.Service;

@Service
public class Myservice {

	
	public String print() {
		System.out.println("Inside Service");
		return"from service method";
	}

}
