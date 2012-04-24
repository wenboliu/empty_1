package pri.tw;

public class BuildJob {
    private String name;
    private String agentName;
    private boolean rerun;
    private String status;

    public BuildJob(String name, String agentName, boolean rerun, String status) {
        this.name = name;
        this.agentName = agentName;
        this.rerun = rerun;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getAgentName() {
        return agentName;
    }

    public boolean isRerun() {
        return rerun;
    }

    public String getStatus() {
        return status;
    }
}
