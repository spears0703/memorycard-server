package io.cahlee.memorycard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String front;
	
	private String back;
	
	private boolean memorized = false;
	
	public Card() {
		
	}
	
	public Card(String front, String back) {
		this.front = front;
		this.back = back;
	}
	
}
