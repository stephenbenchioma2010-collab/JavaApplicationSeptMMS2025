
package polymorphism.methodoverloading;

public class TestingStudentClass {
    public static void main(String[] args){
        Student[] studentObject = {
            new UnderGraduateStudent(),
            new GraduateStudent()
        };
        for(Student student : studentObject){
            student.study();
        }
    }
}
