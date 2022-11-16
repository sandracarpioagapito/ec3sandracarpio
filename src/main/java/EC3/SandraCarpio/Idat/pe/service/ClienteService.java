package EC3.SandraCarpio.Idat.pe.service;

import java.util.List;



import EC3.SandraCarpio.Idat.pe.modelo.Cliente;

public interface ClienteService {
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}
