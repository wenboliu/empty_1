package pri.tw;

public class Clazz {
    private String name;
    private String teacher;
    private String flower;
    private int numberOfStudents;

    public Clazz(String name, String teacher, String flower, int numberOfStudents) {
        this.name = name;
        this.teacher = teacher;
        this.flower = flower;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getFlower() {
        return flower;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}
