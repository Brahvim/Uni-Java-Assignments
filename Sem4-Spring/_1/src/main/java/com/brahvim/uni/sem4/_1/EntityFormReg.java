package com.brahvim.uni.sem4._1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FormRegs")
public class EntityFormReg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(unique = true, nullable = false)
	public String username;

	@Column(unique = true, nullable = false)
	public String passwordHash;

}
