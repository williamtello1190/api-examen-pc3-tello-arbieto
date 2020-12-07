package com.examenpc03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.examenpc03.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	@Query("select x from Usuario x where x.nombres like :var_filtro")
	public List<Usuario> listaPorNombre(@Param("var_filtro") String filtro);
}
