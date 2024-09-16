package com.example.demo;

import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Setter
@Getter
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description", columnDefinition = "text")
	private String description;
	
	@Column(name = "price")
		private int price;
	
	public Product(long l, String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public Object getID() {
		// TODO Auto-generated method stub
		return null;
	}

}
