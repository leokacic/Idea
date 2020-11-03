import java.util.function.Consumer;

public class RobotBuilder {
    public String robotHead;
    public String robotTorso;
    public String robotArms;
    public String robotLegs;
    public RobotName robotName;
    public boolean isHuman;

    public RobotBuilder with(
            Consumer<RobotBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Robot createRobot() {
        return new Robot( robotHead, robotTorso, robotArms, robotLegs, robotName, isHuman);
    }

    public static class RobotNameBuilder {
        public String firstName;
        public String lastName;
        public String address;

        public RobotNameBuilder with (Consumer<RobotNameBuilder> builderFunction) {
            builderFunction.accept(this);
            return this;
        }

        public RobotName createRobotName() {
            return new RobotName(firstName,lastName,address);
        }
    }
}

