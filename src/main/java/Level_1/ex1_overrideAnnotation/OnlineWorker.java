package Level_1.ex1_overrideAnnotation;

public class OnlineWorker extends Worker{
    private static final double INTERNET_PLAN = 8.7;

    public OnlineWorker(String name, String surname, double hourlyRate){
        super(name, surname, hourlyRate);
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * hourlyRate + INTERNET_PLAN;
    }

    @Override
    public String toString() {
        return "OnSite" + super.toString() ;
    }
}
