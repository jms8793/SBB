package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
	@Id
	@GeneratedValuee(strategy = GenerationType.IDENTITY)
	private Integer idInteger;
	
	
	
	
	
	
}
