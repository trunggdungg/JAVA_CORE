package entity;

public class Member extends  Person{
    private static int AUTO_ID = 100;
    private  int idMember;
    private double salary;


    public Member(String name, String add, String temPhone, double salary) {
        super(name, add, temPhone);
        this.idMember = AUTO_ID++;
        this.salary = salary;
    }


    public int getIdMember() {
        return idMember;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Member{" +
                "idMember=" + idMember +
                ", salary=" + salary +
                '}';
    }
}
