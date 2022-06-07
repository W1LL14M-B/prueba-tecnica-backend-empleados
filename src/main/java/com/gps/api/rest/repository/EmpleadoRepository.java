package com.gps.api.rest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gps.api.rest.entity.RegistroEmpleado;

@CrossOrigin
@Repository
public interface EmpleadoRepository extends JpaRepository<RegistroEmpleado, Long>{
// DTO transporta la informacion de datos a la capa Service
	Optional<RegistroEmpleado> findEmpleadoById(Long id);
		
}
