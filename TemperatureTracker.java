import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Initialize days
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Temperatures for each day
        temperatures.add(56.4); // Monday
        temperatures.add(60.3); // Tuesday
        temperatures.add(61.7); // Wednesday
        temperatures.add(66.7); // Thursday
        temperatures.add(64.6); // Friday
        temperatures.add(64.2); // Saturday
        temperatures.add(61.3); // Sunday

        System.out.println("What day of the week would you like to view the weather for?  Or type weekly to see the whole week.:");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("week")) {
            double total = 0;
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i) + "°F");
                total += temperatures.get(i);
            }
            double average = total / days.size();
            System.out.println("Weekly Average: " + String.format("%.2f", average) + "°F");
        } else {
            boolean found = false;
            for (int i = 0; i < days.size(); i++) {
                if (days.get(i).equalsIgnoreCase(input)) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i) + "°F");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Day not recognized. Please ensure you type a day of the week correctly.");
            }
        }
    }
}
