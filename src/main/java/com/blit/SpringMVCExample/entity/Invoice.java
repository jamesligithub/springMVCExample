package com.blit.SpringMVCExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;





@Entity
public class Invoice {

	    @Id
	    @GeneratedValue (strategy=GenerationType.IDENTITY )
	    private Long id;
	    private String name;
	    private String location;
	    private Double amount;
	    
	    
	    @Override
		public String toString() {
			return "Invoice [id=" + id + ", name=" + name + ", location=" + location + ", amount=" + amount + "]";
		}
		
	    
	    
	    
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		
	
	
	
	
	
}
