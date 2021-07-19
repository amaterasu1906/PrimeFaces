package Controllers;

import Pojos.Persona;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import lombok.Data;

@ManagedBean(name = "personaBean")
@ViewScoped
@Data
public class PersonaManagedBean implements Serializable{

    private Persona persona = new Persona();
    private List<Persona> personas = new ArrayList<>();;

    public PersonaManagedBean() {
        persona.setNombre("Kokomi");
        persona.setEdad(16);
        persona.setEmail("kokomi@gmail.com");
    }
    public void addPersona(Persona pe){
        personas.add(pe);
        persona = new Persona();
        for (Persona p : personas) {
            System.err.println(p.toString());
        }
    }

}
