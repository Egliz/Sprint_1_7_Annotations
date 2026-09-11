package Level_1.ex2_deprecatedAnnotation;

public class OnSiteWorker extends Worker{
    private static double gas = 6.4;

    public OnSiteWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }

    public double getGas(){
        return gas;
    }

    /*
   @deprecated, use toString() instead
    */
    @Deprecated
    public String showOnSiteWorker(){
        return "Name: " + getName() + ", surname: " + getSurname() + ", internet plan: " + getGas();
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
