package Level_2.ex1_jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);
        JsonControl jsonControl = new JsonControl(person);

        jsonControl.getDirectoryFromAnnotation(person);


            //metodo para comprobar que el directorio es valido

            ObjectMapper objectMapper= new ObjectMapper();
            try {
                String jsonString = objectMapper.writeValueAsString(person);
                System.out.println(jsonString);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
            //escribir ese JsonString en un archivo
    }
    //TODO metodo para comprobar que el directorio es valido
}
