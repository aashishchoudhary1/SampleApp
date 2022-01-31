package myfirstproject.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/customer")
public class CustomerController {
	
@GetMapping(path="/showdetail")	
	public String showDetails(@RequestParam String id) {
		
		return "This is my first test"+id;
	}

}
