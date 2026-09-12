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

}
