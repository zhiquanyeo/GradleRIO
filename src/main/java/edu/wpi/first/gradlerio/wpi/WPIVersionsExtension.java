package edu.wpi.first.gradlerio.wpi;

import javax.inject.Inject;

import org.gradle.api.provider.Property;

public abstract class WPIVersionsExtension {

    private static final String wpilibVersion = "2024.0.0-alpha-1";
    private static final String niLibrariesVersion = "2023.3.0";
    private static final String opencvVersion = "4.6.0-5";
    private static final String imguiVersion = "1.89.1-2";
    private static final String ejmlVersion = "0.42";
    private static final String jacksonVersion = "2.12.4";
    private static final String wpimathVersion = "2024.0.0-alpha-1";
    private static final String googleTestVersion = "1.12.1-2";

    private static final String smartDashboardVersion = "2024.0.0-alpha-1";
    private static final String shuffleboardVersion = "2024.0.0-alpha-1";
    private static final String outlineViewerVersion = "2024.0.0-alpha-1";
    private static final String robotBuilderVersion = "2024.0.0-alpha-1";
    private static final String pathWeaverVersion = "2024.0.0-alpha-1";
    private static final String glassVersion = "2024.0.0-alpha-1";
    private static final String sysIdVersion = "2023.4.3";
    private static final String roboRIOTeamNumberSetterVersion = "2024.0.0-alpha-1";
    private static final String dataLogToolVersion = "2024.0.0-alpha-1";


    public abstract Property<String> getWpilibVersion();
    public abstract Property<String> getNiLibrariesVersion();
    public abstract Property<String> getOpencvVersion();
    public abstract Property<String> getGoogleTestVersion();
    public abstract Property<String> getImguiVersion();
    public abstract Property<String> getWpimathVersion();

    public abstract Property<String> getEjmlVersion();
    public abstract Property<String> getJacksonVersion();
    public abstract Property<String> getSmartDashboardVersion();
    public abstract Property<String> getShuffleboardVersion();
    public abstract Property<String> getOutlineViewerVersion();
    public abstract Property<String> getRobotBuilderVersion();
    public abstract Property<String> getPathWeaverVersion();
    public abstract Property<String> getGlassVersion();
    public abstract Property<String> getSysIdVersion();
    public abstract Property<String> getRoboRIOTeamNumberSetterVersion();
    public abstract Property<String> getDataLogToolVersion();

    @Inject
    public WPIVersionsExtension() {
        getWpilibVersion().convention(wpilibVersion);
        getNiLibrariesVersion().convention(niLibrariesVersion);
        getOpencvVersion().convention(opencvVersion);
        getGoogleTestVersion().convention(googleTestVersion);
        getImguiVersion().convention(imguiVersion);
        getWpimathVersion().convention(wpimathVersion);

        getEjmlVersion().convention(ejmlVersion);
        getJacksonVersion().convention(jacksonVersion);
        getSmartDashboardVersion().convention(smartDashboardVersion);
        getShuffleboardVersion().convention(shuffleboardVersion);
        getOutlineViewerVersion().convention(outlineViewerVersion);
        getRobotBuilderVersion().convention(robotBuilderVersion);
        getPathWeaverVersion().convention(pathWeaverVersion);
        getGlassVersion().convention(glassVersion);
        getSysIdVersion().convention(sysIdVersion);
        getRoboRIOTeamNumberSetterVersion().convention(roboRIOTeamNumberSetterVersion);
        getDataLogToolVersion().convention(dataLogToolVersion);
    }

}
