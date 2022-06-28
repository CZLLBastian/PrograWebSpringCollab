package pe.edu.upc.demo.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.demo.entities.Student;
import pe.edu.upc.demo.repositories.IStudentRepository;
import pe.edu.upc.serviceinterfaces.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentRepository studentRepository;
	
	@Override
	public void insert(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> list() {
		return studentRepository.findAll();
	}

	@Override
	public void delete(int idStudent) {
		studentRepository.deleteById(idStudent);
	}

	@Override
	public Optional<Student> listId(int idStudent) {
		return studentRepository.findById(idStudent);
	}

	@Override
	public void update(Student student) {
		studentRepository.save(student);
	}
	@Override
	public List<String[]> unistudent() {
		// TODO Auto-generated method stub
		
		return studentRepository.unistudent();
               }

}
