package com.pos.customer.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "countries")
public class Country{
	@Id @GeneratedValue @Column(name = "country_id")
	private Long id;
	
	@Column(name = "country_name", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private List<State> states;
}
