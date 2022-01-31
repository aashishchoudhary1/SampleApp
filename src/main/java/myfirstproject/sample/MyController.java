package myfirstproject.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path="/demo")
public class MyController {

@Autowired	
public Myservice service;
 
@ResponseBody
@GetMapping(path="/detail")
	public String getDetails() {
	
	System.out.println("Hi");
		String res =  service.print();
		 return res;
	 }
}
