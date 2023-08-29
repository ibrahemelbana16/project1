package classes;

import java.util.List;

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


}
