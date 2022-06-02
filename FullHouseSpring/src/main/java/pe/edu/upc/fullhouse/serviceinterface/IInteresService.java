package pe.edu.upc.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.demo.entities.Interes;

public interface IInteresService {
	public void insert(Interes interes);
	List<Interes> list();
	public void delete(int idInteres);
	Optional<Interes> listId(int idInteres);
	public void update(Interes interes);
}
