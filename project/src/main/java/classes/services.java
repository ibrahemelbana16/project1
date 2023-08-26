package classes;

import classes.db;
import classes.student;

public class services {
    private classes.db db;

    public services(db db) {
        this.db = db;
    }
    public void createstudent(student student){
        db.createstudent(student);

    }


}
