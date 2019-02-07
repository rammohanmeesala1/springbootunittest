package br.com.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author jpjava
 * 
 * You can do requests: http://localhost:8080/home
 * 
 * The response will be a Json format representing the Employee Object
 *
 */
@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public Employee home(){
		return new Employee("Jones", "Dev");
	}
	
}
