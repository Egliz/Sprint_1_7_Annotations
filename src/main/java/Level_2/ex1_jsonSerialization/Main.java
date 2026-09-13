package Level_2.ex1_jsonSerialization;


import java.io.File;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);
        JsonControl jsonControl = new JsonControl();

        String directoryFromAnnotation = jsonControl.getDirectoryFromAnnotation(person);
        File directory = new File(directoryFromAnnotation);

        if(checkDirectory(directory)) {
           jsonControl.serialize(directory, person);
        } else {
            throw new IllegalArgumentException("Directory no valid.");
        }
    }

    public static boolean checkDirectory(File directory) {
        if(directory.exists() && directory.isDirectory()) {
            return true;
        }
        return false;
    }
}
