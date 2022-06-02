package pe.edu.upc.universidad.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.universidad.entities.Universidad;

public interface IUniversidadService {
	
	public void insert(Universidad universidad);
	public List<Universidad> list();

	public void delete(int idUniversidad);
	
	
	Optional<Universidad> listId(int idUniversidad);
	public void update(Universidad universidad);
}
