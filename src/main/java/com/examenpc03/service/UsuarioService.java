package com.examenpc03.service;
import java.util.List;
import com.examenpc03.entity.Usuario;
public interface UsuarioService {
	public List<Usuario> listaUsuario();
	public List<Usuario> listaUsuarioPorNombre(String nombre);
}
