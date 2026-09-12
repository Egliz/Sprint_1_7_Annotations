package Level_2.ex1_jsonSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import static com.sun.org.apache.xerces.internal.util.DOMUtil.getAnnotation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Lady", "Gaga", 30);

        if(person.getClass().isAnnotationPresent(CustomAnnotationForJson.class)){
            CustomAnnotationForJson customAnnotation = person.getClass().getAnnotation(CustomAnnotationForJson.class);
            String directory = customAnnotation.directory();
            //metodo para comprobar que el directorio es valido
            //poner que se genere el Json, cambiando outputStream
            try (FileOutputStream fileOut = new FileOutputStream(directory);
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                 objectOut.writeObject(person);
                 System.out.println("Serialized object");
            } catch (IOException e) {
                System.out.println("Error serializing object:" + e.getMessage());
            }
        }
        else {
            //
        }



    }

}
