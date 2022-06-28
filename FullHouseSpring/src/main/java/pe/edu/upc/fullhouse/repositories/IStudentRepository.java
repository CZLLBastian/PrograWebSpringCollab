package pe.edu.upc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entities.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
  //reporte
			@Query(value="Select u.full_name_universidad, Count(e.id_student)from universidad u JOIN student e on u.id_universidad=e.id_universidad Group by u.full_name_universidad", nativeQuery=true)
			public List<String[]>unistudent();

}
