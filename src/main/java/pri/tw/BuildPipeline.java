package pri.tw;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildPipeline {
    private String name;
    private Date triggeredTime;
    private String status;
    private List<BuildPhase> phases = new ArrayList<BuildPhase>();

    public BuildPipeline(String name, Date triggeredTime, String status) {
        this.name = name;
        this.triggeredTime = triggeredTime;
        this.status = status;
    }

    public void addBuildPhase(BuildPhase buildPhase) {
        phases.add(buildPhase);
    }

    public String getName() {
        return name;
    }

    public Date getTriggeredTime() {
        return triggeredTime;
    }

    public String getStatus() {
        return status;
    }
}
