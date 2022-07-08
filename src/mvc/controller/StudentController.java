package mvc.controller;

import mvc.model.Student;
import mvc.service.StudentService;
import mvc.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentServiceImpl();

    public void displayAllStudent(){
        for (Student student: studentService.findAll()){
            System.out.println(student);
        }
    }

    public void addNewStudent(Student student){
        studentService.addStudent(student);
    }


    public static void main(String[] args) {
        StudentController controller = new StudentController();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("--Student Manager--");
            System.out.println("1. List all");
            System.out.println("2. Add new");
            System.out.println("9. Exit");
            select = Integer.parseInt(scanner.nextLine());

            switch (select){
                case 1://list all
                    controller.displayAllStudent();
                    break;
                case 2: //add new
                    System.out.print("Input id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Input name:");
                    String name = scanner.nextLine();

                    controller.addNewStudent(new Student(id, name));
                    break;
                case 9: //exit
                    break;
            }
        } while (true);
    }
}
