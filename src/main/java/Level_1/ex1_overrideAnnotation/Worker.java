package Level_1.ex1_overrideAnnotation;

public class Worker {

    private String name;
    private String surname;
    private static double HOURLY_RATE = 2.8;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public double calculateSalary(int hoursWorked){
        return hoursWorked * HOURLY_RATE;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}