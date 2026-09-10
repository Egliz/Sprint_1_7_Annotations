package Level_1.ex1_overrideAnnotation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("Carmen", "Perez", 8);
        OnlineWorker onlineWorker = new OnlineWorker("Maria", "Soto", 20);
        OnSiteWorker onSiteWorker = new OnSiteWorker ("Brad", "Pitt", 35);

        int hoursWorked = 160;
        System.out.println("Worker's salary: " + worker.calculateSalary(hoursWorked));
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(hoursWorked));
        System.out.println("On site worker salary: " + onSiteWorker.calculateSalary(hoursWorked));
    }
}
