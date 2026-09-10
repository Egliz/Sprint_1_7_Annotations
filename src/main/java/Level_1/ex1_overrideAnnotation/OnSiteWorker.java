package Level_1.ex1_overrideAnnotation;

public class OnSiteWorker extends Worker {

    private static double gasoline = 6.4;

    public OnSiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + gasoline;
    }

    @Override
    public String toString() {
        return super.toString() + "OnSiteWorker{}";
    }
}
