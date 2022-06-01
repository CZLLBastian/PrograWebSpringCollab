package pe.edu.upc.demo.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Arrendador;
import pe.edu.upc.demo.repositories.IArrendadorRepository;
import pe.edu.upc.demo.serviceinterface.IArrendadorService;

@Service
public class ArrendadorServiceImpl implements IArrendadorService {
	@Autowired
	private IArrendadorRepository arrendadorRepository;

	@Override
	public void insert(Arrendador arrendador) {
		arrendadorRepository.save(arrendador);
	}

	@Override
	public List<Arrendador> list() {
		// TODO Auto-generated method stub
		return arrendadorRepository.findAll();
	}

	@Override
	public void delete(int idArrendador) {
		// TODO Auto-generated method stub
		arrendadorRepository.deleteById(idArrendador);

	}

	@Override
	public Optional<Arrendador> listId(int idArrendador) {
		// TODO Auto-generated method stub
		return arrendadorRepository.findById(idArrendador);
	}

	@Override
	public void update(Arrendador arrendador) {
		// TODO Auto-generated method stub
		arrendadorRepository.save(arrendador);
	}

}
