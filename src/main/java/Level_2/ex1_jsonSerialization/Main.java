package Level_2.ex1_jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);
        JsonControl jsonControl = new JsonControl();

        String directory = jsonControl.getDirectoryFromAnnotation(person);

        if(comprobarDirectorio(directory)) {
           // serializar desde jsonControl.serialize(directory, person);
        } else {
            throw new IllegalArgumentException("Directory no valid.");
        }
    }

    public static boolean comprobarDirectorio(String directory) {
        if(directory == null || directory.isBlank()) {
            return false;
        }
        return true;
    }
}

