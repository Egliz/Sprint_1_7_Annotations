package Level_2.ex1_jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);

        if(person.getClass().isAnnotationPresent(CustomAnnotationForJson.class)){
            CustomAnnotationForJson customAnnotation = person.getClass().getAnnotation(CustomAnnotationForJson.class);
            String directory = customAnnotation.directory();
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
        else {
            //
        }
    }
}
