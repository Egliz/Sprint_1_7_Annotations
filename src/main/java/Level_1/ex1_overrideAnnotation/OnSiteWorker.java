package Level_1.ex1_overrideAnnotation;

public class OnSiteWorker extends Worker {

    private static double gasoline;

    public OnSiteWorker(String name, String surname, double hourlyRate double gasoline) {
        super(name, surname, hourlyRate);
        this.gasoline = gasoline;
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
