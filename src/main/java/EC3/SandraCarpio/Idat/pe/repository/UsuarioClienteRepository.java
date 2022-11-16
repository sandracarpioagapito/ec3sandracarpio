package EC3.SandraCarpio.Idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import EC3.SandraCarpio.Idat.pe.modelo.UsuarioCliente;

public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer>{

	UsuarioCliente findByUsuarioCliente(String usuariocliente);

}
