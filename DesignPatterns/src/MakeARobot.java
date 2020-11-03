public class MakeARobot {

    public static void main(String[] args) {

        Robot robot = new RobotBuilder()
                .with($ -> {
                    $.robotHead = "Steel";
                    $.robotArms = "Tin";
                    $.robotLegs = "Metal";
                    $.robotTorso = "Bronze";
                    $.isHuman = false;
                    $.robotName =
                            new RobotBuilder.RobotNameBuilder()
                            .with($_robotName -> {
                                $_robotName.firstName = "John";
                                $_robotName.lastName = "Doe";
                                $_robotName.address = "New York";
                            })
                            .createRobotName();
                })
                .createRobot();

        System.out.println("The robot head is made of: " + robot.robotHead);
        System.out.println("The robot arms is made of: " + robot.robotArms);
        System.out.println("The robot legs is made of: " + robot.robotLegs);
        System.out.println("The robot torso is made of: " + robot.robotTorso);
        System.out.println("Is the robot human? " + robot.isHuman);

        System.out.println("First name of the robot: " + robot.robotName.firstName);
        System.out.println("Last name of the robot: " + robot.robotName.lastName);
        System.out.println("Address of the robot: " + robot.robotName.address);
    }
}
