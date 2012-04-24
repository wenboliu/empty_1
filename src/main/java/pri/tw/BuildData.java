package pri.tw;

import org.joda.time.DateTime;

import java.util.Date;

public class BuildData {

    private static final Date BUILD_START_TIME = new DateTime(2012, 12, 12, 12, 12, 12).toDate();

    public static BuildPipeline getBuildData() {
        BuildPipeline buildPipeline = new BuildPipeline("Home Ideas", BUILD_START_TIME, "running");

        buildPipeline.addBuildPhase(createBuildPhaseOne());
        buildPipeline.addBuildPhase(createBuildPhaseTwo());
        buildPipeline.addBuildPhase(createBuildPhaseThree());

        return buildPipeline;
    }

    private static BuildPhase createBuildPhaseOne() {
        return new BuildPhase("package", 0, "revision:e5b910000000", "<xml>config-for-package</xml>");
    }

    private static BuildPhase createBuildPhaseTwo() {
        BuildPhase standalone = new BuildPhase("standalone", 1, "revision:e5b910000000", "<xml>config-for-standalone</xml>");
        standalone.addBuildJob(createBuildJob());
        return standalone;
    }

    private static BuildJob createBuildJob() {
        return new BuildJob("job1", "go1", false, "running");
    }

    private static BuildPhase createBuildPhaseThree() {
        return new BuildPhase("staging", 2, "revision:e5b910000000", "<xml>>config-for-staging</xml>");
    }
}
