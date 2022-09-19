package com.finzly.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	private String cname;
	
	@OneToOne(mappedBy = "country")
	@JsonIgnore
	private Employee employee;
	
	
}
