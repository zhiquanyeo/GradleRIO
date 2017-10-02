package jaci.openrio.gradle.deploy

import jaci.gradle.targets.RemoteTarget

class RoboRIO {
    public String name
    public int team
    public Closure<RemoteTarget> remote

    public RoboRIO(String name) {
        this.name = name
    }

    public void team(int team) {
        this.team = team
    }

    public void remote(Closure<RemoteTarget> configureTarget) {
        this.remote = configureTarget
    }
}
