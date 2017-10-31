package tn.mine.springcloud;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import tn.mine.springcloud.dao.SocieteRepository;
import tn.mine.springcloud.entities.Societe;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudSocietesMiroServicesApplication {

	public static void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(SpringCloudSocietesMiroServicesApplication.class, args);
		SocieteRepository societeRepository = context.getBean(SocieteRepository.class);
	
		
	
		Stream.of("societe1","societe2","societe3","societe4","societe5","societe6","societe7","societe8","societe9","societe10",
				"societe11","societe12","societe13","societe14","societe15","societe16","societe17","societe18","societe19","societe20",
				"societe21","societe22","societe23","societe24","societe25","societe26","societe27","societe28","societe29","societe30",
				"societe31","societe32","societe33","societe34","societe35","societe36","societe37","societe38","societe39","societe40",
				"societe41","societe42","societe43","societe44","societe45","societe46","societe47","societe48","societe49","societe50",
				"societe51","societe52","societe53","societe54","societe55","societe56","societe57","societe58","societe59","societe60",
				"societe61","societe62","societe63","societe64","societe65","societe66","societe67","societe68","societe69","societe70",
				"societe71","societe72","societe73","societe74","societe75","societe76","societe77","societe78","societe79","societe80",
				"societe81","societe82","societe83","societe84","societe85","societe86","societe87","societe88","societe89","societe90",
				"societe91","societe92","societe93","societe94","societe95","societe96","societe97","societe98","societe99","societe100")
		.forEach(societe->societeRepository.save(new Societe(societe)));
	
		/*
		Stream.of("societe1","societe2","societe3","societe4","societe5","societe6","societe7","societe8","societe9","societe10",
				"societe11","societe12","societe13","societe14","societe15","societe16","societe17","societe18","societe19","societe20",
				"societe21","societe22","societe23","societe24","societe25","societe26","societe27","societe28","societe29","societe30")
		.forEach(societe->societeRepository.save(new Societe(societe)));
		*/
		
		societeRepository.findAll().forEach(societe->System.out.println(societe.getnomSociete()));
		
		
		//for(int i=1;i<101;i++) System.out.print("\"societe"+i+"\",");
		
	}
}
/*
@Configuration
class MyConfig extends RepositoryRestMvcConfiguration{
	//@Override
	protected void configureRestMvcConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Societe.class);
	}
}

*/











