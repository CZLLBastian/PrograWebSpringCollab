package pe.edu.upc.demo.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Interes;
import pe.edu.upc.demo.repositories.IInteresRepository;
import pe.edu.upc.serviceinterfaces.IInteresService;

@Service
public class InteresServiceImpl implements IInteresService {

	@Autowired
	private IInteresRepository interesRepository;
	
	@Override
	public void insert(Interes interes) {
		interesRepository.save(interes);
	}

	@Override
	public List<Interes> list() {
		return interesRepository.findAll();
	}

	@Override
	public void delete(int idInteres) {
		interesRepository.deleteById(idInteres);
	}

	@Override
	public Optional<Interes> listId(int idInteres) {
		return interesRepository.findById(idInteres);
	}

	@Override
	public void update(Interes interes) {
		interesRepository.save(interes);
	}

}
