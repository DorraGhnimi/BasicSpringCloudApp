package tn.mine.springcloud.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Societe implements Serializable {

	
	@Id
	@GeneratedValue
	private Long id;
	private String nomSociete;
	
	
	public Societe() {
		super();
	}
	public Societe(String nomSociete) {
		super();
		this.nomSociete = nomSociete;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnomSociete() {
		return nomSociete;
	}
	public void setnomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	
}
