package ss05_AccesModifier_StaticMethod_StaticProperty.baitap.AccessModifier_Student;

public class Test_Student {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("HuyTran");
        student.setClasses("DepZai");
        System.out.println(student);
    }
}
