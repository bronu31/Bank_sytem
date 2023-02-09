package com.example.demo.model;

import java.sql.Date;
import java.util.LinkedList;
//import javax.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Table(name="Clients")
@Entity
public class Client {
//	@Id
//    @GeneratedValue(GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", nullable = false)
	private String first_name;
	@Column(name = "second_name", nullable = false)
	private String second_name;
	@Column(name = "last_name", nullable = true)
	private String last_name;
	@Column(name = "date_of_birth", nullable = false)
	private Date date_of_birth;
	@Column(name = "register_date", nullable = false)
	private Date register_date;
	//private LinkedList<Long> deposit_number;
	public Client(String first_name, String second_name, String last_name, Date date_of_birth, Date register_date) {
		super();
		this.first_name = first_name;
		this.second_name = second_name;
		this.last_name = last_name;
		this.date_of_birth = date_of_birth;
		this.register_date = register_date;
	}


	
	
	
	
	
	
	

}
