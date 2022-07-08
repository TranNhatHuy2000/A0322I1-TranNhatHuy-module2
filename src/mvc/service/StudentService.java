package mvc.service;

import mvc.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll(); //lấy danh sách sinh vien
    void addStudent(Student student);
    void updateStudent(Student student);
    void remove(int id);
    Student findById(int id);
    //validate..
}
