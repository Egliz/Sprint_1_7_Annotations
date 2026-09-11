package Level_1.ex2_deprecatedAnnotation;

public class Worker {
    private String name;
    private String surname;
    public static double hourlyRate;

    public Worker(String name, String surname, double hourlyRate) {
        if (name.isBlank() || surname.isBlank()) {
            throw new IllegalArgumentException("Enter valid values.");
        }
        if(hourlyRate <= 0) {
            throw new IllegalArgumentException("Enter valid values.");
        }

        this.name = name;
        this.surname = surname;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary(int hoursWorked){
        if(hoursWorked <= 0){
            throw new IllegalArgumentException("Enter valid values");
        }
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
