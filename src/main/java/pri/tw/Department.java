package pri.tw;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private int order;
    private String major;
    private String flowers;
    private List<Clazz> clazzs = new ArrayList<Clazz>();

    public Department(String name, int order, String major, String flowers) {
        this.name = name;
        this.order = order;
        this.major = major;
        this.flowers = flowers;
    }

    public void addClazz(Clazz clazz) {
        clazzs.add(clazz);
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public String getMajor() {
        return major;
    }

    public String getFlowers() {
        return flowers;
    }
}
