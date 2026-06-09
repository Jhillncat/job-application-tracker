import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();

        while(true) {
            System.out.println("\nJOB TRACKER");
            System.out.println("1. Add Application");
            System.out.println("2. View Application");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Company: ");
                String company = scanner.nextLine();

                System.out.println("Position: ");
                String position = scanner.nextLine();

                System.out.println("Status: ");
                String status = scanner.nextLine();

                Application app = new Application(company, position, status);

                tracker.addApplication(app);
                System.out.println("Added!");
            }

            else if (choice == 2) {
                tracker.displayApplications();
            }

            else if(choice == 3) {
                break;
            }

        }
    }
}