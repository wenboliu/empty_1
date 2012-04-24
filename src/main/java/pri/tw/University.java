package pri.tw;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class University {
    private String name;
    private Date establishedTime;
    private String flowers;
    private List<Department> departments = new ArrayList<Department>();

    public University(String name, Date establishedTime, String flowers) {
        this.name = name;
        this.establishedTime = establishedTime;
        this.flowers = flowers;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Date getEstablishedTime() {
        return establishedTime;
    }

    public String getFlowers() {
        return flowers;
    }
}
