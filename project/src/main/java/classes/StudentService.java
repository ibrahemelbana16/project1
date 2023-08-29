package classes;

import java.util.List;

import static org.example.Main.scanStudent;

public class StudentService {
    private classes.StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createstudent(Student student) {
        studentRepository.createstudent(student);

    }

    public void list() {
      List<Student>list=  studentRepository.getAllStudents();
      for (Student student:list){
          System.out.println(student);
      }

    }
    public void update(Student student) {
        studentRepository.update(student);

    }
    public Student getbyid(int id) {

      return  studentRepository.getStudentsById(id);

    }
    public void updatemain(int id) {
        Student student= getbyid(id);
        System.out.println(student);
        System.out.println("age,name,university");
        Student updatestudent=  scanStudent();
       student.changeStudent(updatestudent.getName(),updatestudent.getAge(),updatestudent.getUniversity());
        update(student);


    }



}
