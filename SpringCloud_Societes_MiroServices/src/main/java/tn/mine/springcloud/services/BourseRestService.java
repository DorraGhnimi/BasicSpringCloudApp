package tn.mine.springcloud.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RefreshScope //min 3and "Actuator"

@RestController
public class BourseRestService {

	
	//injecter la propriete "me"
	@Value("${me}")
	private String message;
	
	@RequestMapping("/who")
	public String whoAmI() {
		
		System.out.println("\n\n\n *******************");
		System.out.println("Hello ! it's mee !  ");
		System.out.println("*******************\n\\n\n ");
		
		
		return message;
	}
		
	
	

}
