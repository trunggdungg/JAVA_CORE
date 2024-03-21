package entity;

public class Person {
    private String name;
    private String add;
    private String temPhone;

    public Person(String name, String add, String temPhone) {
        this.name = name;
        this.add = add;
        this.temPhone = temPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getTemPhone() {
        return temPhone;
    }

    public void setTemPhone(String temPhone) {
        this.temPhone = temPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", temPhone='" + temPhone + '\'' +
                '}';
    }
}
