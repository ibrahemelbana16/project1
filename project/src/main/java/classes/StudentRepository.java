package classes;

import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class StudentRepository extends db {

    public StudentRepository() throws Exception {
        super();
    }

    public void createstudent(Student student) {
        Session session = startSession();
        session.save(student);
        commitSession(session);
    }

    public void list(Student student) {

    }
    public List<Student> getAllStudents() {
        Session session = startSession();
        try {
            Query query = session.createQuery("FROM Student", Student.class);
            return query.getResultList();
        } finally {
            session.close();
        }

    }
    public Student getStudentsById(int id) {
        Session session = startSession();
        try {
            Query query = session.createQuery("FROM Student where id = :id ", Student.class);
            query.setParameter("id",id);
            return (Student) query.uniqueResult();
        } finally {
            session.close();
        }

    }
    public void update(Student student) {

        Session session = startSession();
        session.update(student);
        commitSession(session);
    }

    }

