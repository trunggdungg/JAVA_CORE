package entities;

import java.util.List;

public class Clazz {
    private String subject;

    private List<Student> students;

    public Clazz(String subject, List<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public Clazz() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "subject='" + subject + '\'' +
                ", students=" + students +
                '}';
    }
}
