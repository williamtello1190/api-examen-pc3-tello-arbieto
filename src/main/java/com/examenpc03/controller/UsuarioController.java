package com.examenpc03.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examenpc03.entity.Usuario;
import com.examenpc03.service.UsuarioService;
@RestController
@RequestMapping("/api/rest/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Usuario>> lista(){
		return ResponseEntity.ok(service.listaUsuario());
	}
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Usuario>> listaPorNombre(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaUsuarioPorNombre(filtro+"%"));
	}
}
