public class Employee extends Person {
    private double experience;

    public Employee() {
    }

    public Employee(int id, String name, int age, double experience) {
        super(id, name, age);
        this.experience = experience;
    }


    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "Employee{" +
                "experience=" + experience +
                '}';
    }
}
