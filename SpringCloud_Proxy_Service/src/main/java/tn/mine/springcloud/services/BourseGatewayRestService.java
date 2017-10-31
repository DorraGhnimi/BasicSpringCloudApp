package tn.mine.springcloud.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BourseGatewayRestService {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value="/names")
	public Collection<Societe> listSocietes(@RequestParam(defaultValue="0")int page,@RequestParam(defaultValue="30") int size) {

		ParameterizedTypeReference<Resources<Societe>> responseType = new ParameterizedTypeReference<Resources<Societe>>() {
		};
		return restTemplate.exchange("http://localhost:8001/societe-service/societes?page="+page+"&size="+size, HttpMethod.GET, null, responseType).getBody()
				.getContent();
	}
}

class Societe {

	private Long id;
	private String nomSociete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

}
