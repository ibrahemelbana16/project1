package classes;

import classes.student;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class student_att {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private Date date;
    @ManyToOne
    @JoinColumn
            (
                    name = "student_fk"

            )
    private classes.student student;

    public student_att() {
    }

    public student_att(int id, Date date, boolean isattendent) {
        this.id = id;
        this.date = date;
        this.isattendent = isattendent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isIsattendent() {
        return isattendent;
    }

    public void setIsattendent(boolean isattendent) {
        this.isattendent = isattendent;
    }

    private boolean isattendent;
}
