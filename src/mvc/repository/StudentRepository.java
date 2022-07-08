package mvc.repository;

import mvc.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll(); //lấy danh sách sinh vien
    void addStudent(Student student);
    void updateStudent(Student student);
    void remove(int id);
    Student findById(int id);
}
