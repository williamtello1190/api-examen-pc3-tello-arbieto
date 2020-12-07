package com.examenpc03.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examenpc03.entity.Usuario;
import com.examenpc03.repository.UsuarioRepository;
@Service
public class UsuarioServiceIml implements UsuarioService{

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> listaUsuario() {
		return  repository.findAll();
	}

	@Override
	public List<Usuario> listaUsuarioPorNombre(String nombre) {
		return repository.listaPorNombre(nombre);
	}

}
