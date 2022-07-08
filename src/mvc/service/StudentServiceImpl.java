package mvc.service;

import mvc.model.Student;
import mvc.repository.StudentRepository;
import mvc.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        repository.updateStudent(student);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }

    @Override
    public Student findById(int id) {
        return repository.findById(id);
    }
}
