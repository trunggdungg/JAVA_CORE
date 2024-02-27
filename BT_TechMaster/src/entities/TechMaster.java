package entities;

public class TechMaster {
    private  String monitor;

    private String teacher;

    private  Clazz clazz;

    public TechMaster(String monitor, String teacher, Clazz clazz) {
        this.monitor = monitor;
        this.teacher = teacher;
        this.clazz = clazz;
    }

    public TechMaster() {
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "TechMaster{" +
                "monitor='" + monitor + '\'' +
                ", teacher='" + teacher + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
