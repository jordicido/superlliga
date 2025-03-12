import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;

public class carregarDades {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (JsonReader reader = new JsonReader(new FileReader("datos.json"))) {
            Persona persona = gson.fromJson(reader, Persona.class);
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Email: " + persona.getEmail());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
