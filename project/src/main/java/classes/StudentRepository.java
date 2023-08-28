package classes;

import org.hibernate.Session;

public class StudentRepository extends db {

    public StudentRepository() throws Exception {
    }

    public void createstudent(Student student) {
        Session session = startSession();
        session.save(student);
        commitSession(session);
    }

    public void list(Student student) {

    }

}

