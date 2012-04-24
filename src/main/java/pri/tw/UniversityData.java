package pri.tw;

import org.joda.time.DateTime;

import java.util.Date;

public class UniversityData {

    private static final Date ESTABLISHED_TIME = new DateTime(1900, 12, 12, 12, 12, 12).toDate();

    public static University getUniversity() {
        University university = new University("Xi Dian", ESTABLISHED_TIME, "active");

        university.addDepartment(createDepartmentOne());
        university.addDepartment(createDepartmentTwo());
        university.addDepartment(createDepartmentThree());

        return university;
    }

    private static Department createDepartmentOne() {
        return new Department("One", 0, "", "");
    }

    private static Department createDepartmentTwo() {
        Department standalone = new Department("Two", 1, "", "");
        standalone.addClazz(createBuildJob());
        return standalone;
    }

    private static Clazz createBuildJob() {
        return new Clazz("20120101", "xxx", "", 30);
    }

    private static Department createDepartmentThree() {
        return new Department("three", 2, "", "");
    }
}
