package pe.edu.upc.universidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.universidad.entities.Universidad;

@Repository
public interface IUniversidadRepository extends JpaRepository<Universidad, Integer> {

}
