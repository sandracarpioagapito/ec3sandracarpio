package EC3.SandraCarpio.Idat.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EC3.SandraCarpio.Idat.pe.modelo.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	Cliente findBycliente(String cliente);

}
