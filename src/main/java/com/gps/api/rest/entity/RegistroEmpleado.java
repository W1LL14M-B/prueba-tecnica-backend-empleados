package com.gps.api.rest.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class RegistroEmpleado {
//	crtl+shit+o para importar todas las anotaciones 
	@Id  
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "identificacion")
	private Long identificacion;
	
    @Column(name = "tipo_identificacion")
	private String tipo_identificacion;
 
    @Column(name = "pmr_nombre")
	private String pmr_nombre;
    
    @Column(name = "sgd_nombre")
	private String sgd_nombre;
    
    @Column(name = "pmr_apellido")
	private String pmr_apellido;
    
    @Column(name = "sgd_apellido")
	private String sgd_apellido;
     
    @Column(name = "area")
	private String area;
    
    @Column(name = "email")
	private String email;
    
    @Column(name = "pais_empleo")
	private String pais_empleo;
	
	@Column(name = "fecha_ingreso")
	private LocalDate fechaIngreso;
	
	@Column(name = "fecha_retiro")
	private LocalDate fechaRetiro;
	
    @Column(name = "estado")
	private String estado;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
