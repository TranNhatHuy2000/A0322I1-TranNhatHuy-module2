package mvc.repository;

import mvc.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1,"Nguyen Van A"));
        studentList.add(new Student(2,"Nguyen Van B"));
        studentList.add(new Student(3,"Nguyen Van C"));
        studentList.add(new Student(4,"Nguyen Van D"));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        //
    }

    @Override
    public void remove(int id) {
        //
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
