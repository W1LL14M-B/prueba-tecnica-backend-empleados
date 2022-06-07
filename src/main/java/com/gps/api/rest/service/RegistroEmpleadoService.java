	package com.gps.api.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gps.api.rest.dto.RegistroEmpleadoDTO;
import com.gps.api.rest.entity.RegistroEmpleado;
import com.gps.api.rest.repository.EmpleadoRepository;

@Service
public class RegistroEmpleadoService {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public RegistroEmpleado agregarEmpleado(RegistroEmpleado registroEmpleado) {
		return empleadoRepository.save(registroEmpleado); 
	}

	public RegistroEmpleado editarEmpleado(RegistroEmpleado registroEmpleado) {

		return empleadoRepository.save(registroEmpleado);
	}

	public List<RegistroEmpleado> findAllEmpleados() {
		return empleadoRepository.findAll();
	}

	public Optional<RegistroEmpleado> findEmpleadoById(Long id) {
		return empleadoRepository.findEmpleadoById(id);
	}

	public Optional<RegistroEmpleado> updateUsuarioId(Long usuarioId, RegistroEmpleado empleadoReq) {
		return empleadoRepository.findById(usuarioId).map(empleado -> {
			empleado.setIdentificacion(empleadoReq.getIdentificacion());
			empleado.setTipo_identificacion(empleadoReq.getTipo_identificacion());
			empleado.setPmr_nombre(empleadoReq.getPmr_nombre());
			empleado.setSgd_nombre(empleadoReq.getSgd_nombre());
			empleado.setPmr_apellido(empleadoReq.getPmr_apellido());
			empleado.setSgd_apellido(empleadoReq.getSgd_apellido());
			empleado.setArea(empleadoReq.getArea()); 
			empleado.setEmail(empleadoReq.getEmail());
			empleado.setPais_empleo(empleadoReq.getPais_empleo());
			empleado.setFechaIngreso(empleadoReq.getFechaIngreso());
			empleado.setFechaRetiro(empleadoReq.getFechaRetiro());
			empleado.setEstado(empleadoReq.getEstado());
			return empleadoRepository.save(empleado);
		});
	}

	public void deleteUsuario(Long id) {
		empleadoRepository.deleteById(id);
	}
}
