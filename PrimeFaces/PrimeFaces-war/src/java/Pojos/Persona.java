package Pojos;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Persona implements Serializable{
    private String nombre;
    private Integer edad;
    private String email;
    private Date fechaNacimiento;

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
