package com.gps.api.rest.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEmpleadoDTO {
    public static RegistroEmpleadoDTO builder;
	// El Dto trasnporta los datos para no dejarle esa funcion al entity
	private Long id;
	private Long identificacion;
	private String tipo_identificacion;
	private String estado;
	private String area;
	private String pmr_nombre;    
	private String sgd_nombre;    
	private String pmr_apellido;
	private String sgd_apellido;
	private String email;	
	private String pais_empleo;	
	private LocalDate fechaIngreso;
	private LocalDate fechaRetiro;
	public static RegistroEmpleadoDTO buidel() {
		// TODO Auto-generated method stub
		return null;
	}
}
