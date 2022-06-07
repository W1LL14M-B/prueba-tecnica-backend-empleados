package com.gps.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gps.api.rest.converter.Converter;
import com.gps.api.rest.dto.RegistroEmpleadoDTO;
import com.gps.api.rest.entity.RegistroEmpleado;
import com.gps.api.rest.service.RegistroEmpleadoService;
@CrossOrigin
@RestController
public class RegistroEmpleadoController {

	@Autowired
	private RegistroEmpleadoService registroEmpleadoService;
	
	private Converter RegistroEmpleadoConverter = new  Converter();

	@PostMapping("/empleado")
    public ResponseEntity<RegistroEmpleadoDTO> addRegistroEmpleado(@RequestBody RegistroEmpleadoDTO RegistroEmpleado)
    {	
		RegistroEmpleado crearRegistroEmpleado = registroEmpleadoService.agregarEmpleado(RegistroEmpleadoConverter.fromDTO(RegistroEmpleado));
        RegistroEmpleadoDTO RegistroEmpleadoDTO =  RegistroEmpleadoConverter.fromEntity(crearRegistroEmpleado);
        return new ResponseEntity<RegistroEmpleadoDTO>(RegistroEmpleadoDTO, HttpStatus.CREATED); 
    }

	@GetMapping("/listados")
    public ResponseEntity<List<RegistroEmpleadoDTO>> getAllEmpleados()
    {
		List<RegistroEmpleado> listarRegistroEmpleados = registroEmpleadoService.findAllEmpleados();
        List<RegistroEmpleadoDTO> listarRegistroEmpleadosDto = RegistroEmpleadoConverter.fromEntity(listarRegistroEmpleados) ;
        return new ResponseEntity<List<RegistroEmpleadoDTO>>(listarRegistroEmpleadosDto, HttpStatus.OK);
    }

	@GetMapping("/buscarempleado/{id}")
	 public ResponseEntity<RegistroEmpleadoDTO> getEmpleadoById(@PathVariable("id") Long id)
    {
		Optional<RegistroEmpleado> buscarRegistroEmpleado = registroEmpleadoService.findEmpleadoById(id) ;
		RegistroEmpleadoDTO buscarRegistroEmpleadoDTO = RegistroEmpleadoConverter.fromEntity(buscarRegistroEmpleado) ;
        return new ResponseEntity<RegistroEmpleadoDTO>(buscarRegistroEmpleadoDTO, HttpStatus.OK);
    }

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<RegistroEmpleadoDTO> updateRegistroEmpleadoId(@PathVariable("id") Long usuarioId, @RequestBody RegistroEmpleadoDTO RegistroEmpleado)
    {
		Optional<RegistroEmpleado> updateRegistroEmpleado = registroEmpleadoService.updateUsuarioId(usuarioId, RegistroEmpleadoConverter.fromDTO(RegistroEmpleado)) ;
		RegistroEmpleadoDTO actualizarRegistroEmpleado =  RegistroEmpleadoConverter.fromEntity(updateRegistroEmpleado);
        return new ResponseEntity<RegistroEmpleadoDTO>(actualizarRegistroEmpleado, HttpStatus.OK);
    }

	@DeleteMapping("/eliminar/{id}")
	 public ResponseEntity<?> eliminarUsuario(@PathVariable("id") Long id)
    {
		 Optional<RegistroEmpleado>RegistroEmpleado= registroEmpleadoService.findEmpleadoById(id) ;
		RegistroEmpleadoDTO RegistroEmpleadoDTO = RegistroEmpleadoConverter.fromEntity(RegistroEmpleado) ;
		registroEmpleadoService.deleteUsuario(RegistroEmpleadoDTO.getId()) ;
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
