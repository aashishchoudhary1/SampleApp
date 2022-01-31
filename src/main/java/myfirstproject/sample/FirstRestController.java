package myfirstproject.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/demoTest")

public class FirstRestController {

	 @GetMapping(path="/getSum")
	public void getSum() {
		 System.out.println(" total Sum");
	 }
}
