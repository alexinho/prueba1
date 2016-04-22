package com.qalta.javaEEprojectprueba.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Edificio implements Serializable{
	    @Id
	    @GeneratedValue
	    private Long id;

	    @NotNull
	    @Size(min = 1, max = 25)
	    @Pattern(regexp = "[^0-9]*", message = "Must not contain numbers")
	    private String name;

	    @NotNull
	    @NotEmpty
	    @Size(min = 1, max = 30)
	    private String ubicacion;

	


		public Long getId() {
		    return id;
		}
		
		public void setId(Long id) {
		    this.id = id;
		}
		
		
		public String getName() {
		    return name;
		}
		
		public void setName(String name) {
		    this.name = name;
		}
		
		public String getEmail() {
		    return ubicacion;
		}
		
		public void setEmail(String ubicacion) {
		    this.ubicacion = ubicacion;
		}

}
