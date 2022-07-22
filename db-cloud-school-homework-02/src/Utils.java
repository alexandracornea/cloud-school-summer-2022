/**
 * useful methods for simulating traffic light in an intersection.
 */
public class Utils {
    /**
     * the traffic light turns green, cars are allowed to pass the intersection. The
     * method prints an appropriate message.
     *
     * @param direction north-south or west-east, the direction the cars pass through
     */
    public static void changeToGreen(String direction) {
        if (direction.equals("NS")) {
            System.out.println("GREEN light ON through north-south direction.");
        }
        if (direction.equals("WE")) {
            System.out.println("GREEN light ON through west-east direction.");
        }
    }

    /**
     * the traffic light turns red, cars are not allowed anymore to pass the
     * intersection. The method prints an appropriate message, and it prints the
     * number of left cars that did not have time to pass.
     *
     * @param direction north-south or west-east, the direction the cars passed through
     * @param cars the number of left cars that did not have time to pass
     */
    public static void changeToRed(String direction, int cars) {
        if (direction.equals("NS")) {
            System.out.println("RED light ON through north-south direction.");
        }
        if (direction.equals("WE")) {
            System.out.println("RED light ON through west-east direction.");
        }
        if (cars == 0) {
            System.out.println("All cars did pass the intersection.");
        }
        if (cars == 1) {
            System.out.println("One car did not have time to pass the intersection.");
        }
        if (cars > 1) {
            System.out.println(cars + " cars did not have time to pass the intersection.");
        }
        System.out.println();
    }

    /**
     * notifies that a specific numbered car is passing the intersection.
     *
     * @param direction north-south or west-east, the direction the cars pass through
     * @param no the number of the car
     */
    public static void go(String direction, int no) {
        if (direction.equals("NS")) {
            System.out.println("Car " + no + " is passing through north-south direction.");
        }
        if (direction.equals("WE")) {
            System.out.println("Car " + no + " is passing through west-east direction.");
        }
    }
}
