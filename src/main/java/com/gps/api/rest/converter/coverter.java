package com.gps.api.rest.converter;

import java.util.Optional;

import com.gps.api.rest.dto.RegistroEmpleadoDTO;
import com.gps.api.rest.entity.RegistroEmpleado;

public class Converter extends AbstractConverter<RegistroEmpleado, RegistroEmpleadoDTO>{

	// convertir de ENTITY a DTO 
	@Override
	public RegistroEmpleadoDTO fromEntity(RegistroEmpleado entity) {
		 if(entity == null) return null;
       return RegistroEmpleadoDTO.builder()
               .id(entity.getId())
               .identificacion(entity.getIdentificacion())
               .tipo_identificacion(entity.getTipo_identificacion())
               .pmr_nombre(entity.getPmr_nombre())
               .sgd_nombre(entity.getSgd_nombre())
               .pmr_apellido(entity.getPmr_nombre())
               .sgd_apellido(entity.getSgd_apellido() )
               .area(entity.getArea())
               .email(entity.getEmail())
               .pais_empleo(entity.getPais_empleo())
               .fechaIngreso(entity.getFechaIngreso())
               .fechaRetiro(entity.getFechaRetiro())
               .estado(entity.getEstado())
               .build();
	
	}	
 
	// convertir de DTO A ENTITY 
	@Override
	public RegistroEmpleado fromDTO(RegistroEmpleadoDTO dto) {
      if(dto == null) return null;
      return RegistroEmpleado.builder()
    		  .id(dto.getId())
    		  .identificacion(dto.getIdentificacion())
              .tipo_identificacion(dto.getTipo_identificacion())
              .pmr_nombre(dto.getPmr_nombre())
              .sgd_nombre(dto.getSgd_nombre())
              .pmr_apellido(dto.getPmr_nombre())
              .sgd_apellido(dto.getSgd_apellido() )
              .area(dto.getArea())
              .email(dto.getEmail())
              .pais_empleo(dto.getPais_empleo())
              .fechaIngreso(dto.getFechaIngreso())
              .fechaRetiro(dto.getFechaRetiro())
              .estado(dto.getEstado())
              .build();
	
	}

	@Override
	public RegistroEmpleadoDTO fromEntity(Optional<RegistroEmpleado> entity) {
		 if(entity == null) return null;
	       return RegistroEmpleadoDTO.builder()
	               .id(entity.get().getId())
	               .identificacion(entity.get().getIdentificacion())
	     		   .tipo_identificacion(entity.get().getTipo_identificacion())
	               .pmr_nombre(entity.get().getPmr_nombre())
	               .sgd_nombre(entity.get().getSgd_nombre())
	               .pmr_apellido(entity.get().getPmr_nombre())
	               .sgd_apellido(entity.get().getSgd_apellido() )
	               .area(entity.get().getArea())
	               .email(entity.get().getEmail())
	               .pais_empleo(entity.get().getPais_empleo())
	               .fechaIngreso(entity.get().getFechaIngreso())
	               .fechaRetiro(entity.get().getFechaRetiro())
	               .estado(entity.get().getEstado())
	               .build();
	}

	@Override
	public RegistroEmpleado fromDTO(Optional<RegistroEmpleadoDTO> dto) {
	      if(dto == null) return null;
	      return RegistroEmpleado.builder()
	    		  .id(dto.get().getId())
	    		  .identificacion(dto.get().getIdentificacion())
	    		  .tipo_identificacion(dto.get().getTipo_identificacion())
	              .pmr_nombre(dto.get().getPmr_nombre())
	              .sgd_nombre(dto.get().getSgd_nombre())
	              .pmr_apellido(dto.get().getPmr_nombre())
	              .sgd_apellido(dto.get().getSgd_apellido() )
	              .area(dto.get().getArea())
	              .email(dto.get().getEmail())
	              .pais_empleo(dto.get().getPais_empleo())
	              .fechaIngreso(dto.get().getFechaIngreso())
	              .fechaRetiro(dto.get().getFechaRetiro())
	              .estado(dto.get().getEstado())
	              .build();
	}
}
