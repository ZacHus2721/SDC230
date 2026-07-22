public class RobotTest {

    public static void main(String[] args) {

        CleaningRobot cleaner = new CleaningRobot("SweepBot", "CL-100", 90);
        SecurityRobot guard = new SecurityRobot("GuardianX", "SR-200", 85);
        DeliveryRobot delivery = new DeliveryRobot("CargoBot", "DL-300", 95);

        cleaner.performTask();
        guard.performTask();
        delivery.performTask();
    }
}