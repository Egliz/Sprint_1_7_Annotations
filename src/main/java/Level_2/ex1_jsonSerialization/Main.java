package Level_2.ex1_jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);
        JsonControl jsonControl = new JsonControl();

        String directory = jsonControl.getDirectoryFromAnnotation(person);
        //metodo para comprobar que el directorio es valido
        //comprobarDirectorio(directory);
        if(comprobarDirectorio(directory)) {
            //serializar(directory);


        }

            //escribir ese JsonString en un archivo
    }
    //TODO metodo para comprobar que el directorio es valido
    public boolean comprobarDirectorio(String directory) {
        if(directory == null || directory.isBlank()) {
            throw new IllegalArgumentException("Directory no valid.");
            //o false??
            return false;
        }
        return true;
    }
}
