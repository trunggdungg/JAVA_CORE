package entities;

public class Student {
    private int id;
    private String name;
    private int age;
    private String rank;

    public Student(int id, String name, int age, String rank) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "studentInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }
}
