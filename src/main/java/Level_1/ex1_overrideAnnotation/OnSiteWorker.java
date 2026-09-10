package Level_1.ex1_overrideAnnotation;

public class OnSiteWorker extends Worker {

    private static double gas = 6.4;

    public OnSiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + gas;
    }

    @Override
    public String toString() {
        return "OnSite " + super.toString();
    }
}
