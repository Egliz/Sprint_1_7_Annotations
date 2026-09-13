package Level_2.ex1_jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonControl {

    public String getDirectoryFromAnnotation(Person person) {
        if (person.getClass().isAnnotationPresent(CustomAnnotationForJson.class)) {
            CustomAnnotationForJson customAnnotation = person.getClass().getAnnotation(CustomAnnotationForJson.class);
            String directory = customAnnotation.directory();
            return directory;
        } else {
            return null;
        }
    }

    public void serialize(File directory, Person person) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String jsonString = objectMapper.writeValueAsString(person);
            System.out.println(jsonString);
            String filePath = directory + File.separator + "SerializedObject.json";

            try (FileWriter fileWriter = new FileWriter(filePath);
                 ){
                fileWriter.write(jsonString);

            } catch (IOException e){
                System.out.println("Error writing to file." + e.getMessage());
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
}
}