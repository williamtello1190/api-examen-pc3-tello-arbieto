package com.examenpc03.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ubigeo")
@Getter
@Setter
public class Ubigeo {
	 @Id
	 private int idUbigeo;
	 private String departamento;
	 private String provincia;
	 private String distrito;
}
