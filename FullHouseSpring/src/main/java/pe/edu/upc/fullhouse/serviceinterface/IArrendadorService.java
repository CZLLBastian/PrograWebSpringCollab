package pe.edu.upc.demo.serviceinterface;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.demo.entities.Arrendador;

public interface IArrendadorService {
	
	public void insert(Arrendador arrendador);
	List<Arrendador> list();
	public void delete(int idArrendador);
	Optional<Arrendador> listId(int idArrendador);
	public void update(Arrendador arrendador);

}
