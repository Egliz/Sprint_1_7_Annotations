package Level_2.ex1_jsonSerialization;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);
        JsonControl jsonControl = new JsonControl();

        String directory = jsonControl.getDirectoryFromAnnotation(person);

        if(checkDirectory(directory)) {
           // serializar desde jsonControl.serialize(directory, person);
        } else {
            throw new IllegalArgumentException("Directory no valid.");
        }
    }

    public static boolean checkDirectory(String directory) {
        if(directory == null || directory.isBlank()) {
            return false;
        }
        return true;
    }
}

