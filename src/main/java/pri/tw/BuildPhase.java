package pri.tw;

import java.util.ArrayList;
import java.util.List;

public class BuildPhase {
    private String name;
    private int order;
    private String materials;
    private String config;
    private List<BuildJob> buildJobs = new ArrayList<BuildJob>();

    public BuildPhase(String name, int order, String materials, String config) {
        this.name = name;
        this.order = order;
        this.materials = materials;
        this.config = config;
    }

    public void addBuildJob(BuildJob buildJob) {
        buildJobs.add(buildJob);
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public String getMaterials() {
        return materials;
    }

    public String getConfig() {
        return config;
    }
}
