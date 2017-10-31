package tn.mine.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class SpringCloudProxyServiceApplication {

	public static void main(String[] args) {
	
		
		SpringApplication.run(SpringCloudProxyServiceApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	



}
