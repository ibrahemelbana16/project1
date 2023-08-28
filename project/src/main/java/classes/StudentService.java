package classes;

public class StudentService {
    private classes.StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void createstudent(Student student) {
        studentRepository.createstudent(student);

    }

    public void list(Student student) {
        studentRepository.list(student);

    }


}
