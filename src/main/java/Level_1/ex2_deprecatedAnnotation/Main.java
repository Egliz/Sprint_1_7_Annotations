package Level_1.ex2_deprecatedAnnotation;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Worker worker = new Worker("Carmen", "Perez", 8);
        OnlineWorker onlineWorker = new OnlineWorker("Maria", "Soto", 20);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Brad", "Pitt", 35);

        int hoursWorked = 160;
        System.out.println(worker.toString() + "Salary: " + worker.calculateSalary(hoursWorked));
        System.out.println(onlineWorker.showOnlineWorker() + "Salary: " + onlineWorker.calculateSalary(hoursWorked));
        System.out.println(onSiteWorker.showOnSiteWorker() + "Salary: " + onSiteWorker.calculateSalary(hoursWorked));

    }
}
