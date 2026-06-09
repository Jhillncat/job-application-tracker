import java.util.ArrayList;

public class Tracker {
    private ArrayList<Application> applications;

    public Tracker() {
        applications = new ArrayList<>();
    }

    public void addApplication(Application app){
        applications.add(app);
    }

    public void displayApplications() {
        if (applications.isEmpty()){
            System.out.println("No applications found.");
            return;
        }
        for (Application app : applications){
            System.out.println(app);
        }
    }
}
