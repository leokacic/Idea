public class Robot {
    public String robotHead;
    public String robotTorso;
    public String robotArms;
    public String robotLegs;
    public RobotName robotName;
    public boolean isHuman;

    public Robot(String robotHead, String robotTorso, String robotArms, String robotLegs, RobotName robotName, boolean isHuman) {
        this.robotHead = robotHead;
        this.robotTorso = robotTorso;
        this.robotArms = robotArms;
        this.robotLegs = robotLegs;
        this.robotName = robotName;
        this.isHuman = isHuman;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(String robotHead) {
        this.robotHead = robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public void setRobotTorso(String robotTorso) {
        this.robotTorso = robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public void setRobotArms(String robotArms) {
        this.robotArms = robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    public void setRobotLegs(String robotLegs) {
        this.robotLegs = robotLegs;
    }

    public RobotName getRobotName() {
        return robotName;
    }

    public void setRobotName(RobotName robotName) {
        this.robotName = robotName;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }
}
