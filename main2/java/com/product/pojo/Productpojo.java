package com.product.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Productpojo {
	
	@Id
	public String id;
	
	@Column
	public String pname;
	
	@Column
	public String price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Productpojo [id=" + id + ", pname=" + pname + ", price=" + price + ", getId()=" + getId()
				+ ", getPname()=" + getPname() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
	
}
