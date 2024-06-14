import java.util.Objects;

public class Persona implements Comparable<Persona>{

    //Atributos
    private String nombreApellidoPersona;
    private String dniPersona;
    private String telefonoPersona;
    private String domicilioPersona;
    private String edadPersona;

    //Métodos constructores
    public Persona(String nombreApellidoPersona, String edadPersona, String domicilioPersona, String telefonoPersona, String dniPersona) {
        this.nombreApellidoPersona = nombreApellidoPersona;
        this.edadPersona = edadPersona;
        this.domicilioPersona = domicilioPersona;
        this.telefonoPersona = telefonoPersona;
        this.dniPersona = dniPersona;
    }

    public Persona() {
        this.nombreApellidoPersona = "";
        this.edadPersona = "";
        this.domicilioPersona = "";
        this.telefonoPersona = "";
        this.dniPersona = "";
    }

    //Métodos getter y setter
    public String getNombreApellidoPersona() { return nombreApellidoPersona; }
    public void setNombreApellidoPersona(String nombreApellidoPersona) { this.nombreApellidoPersona = nombreApellidoPersona; }

    public String getEdadPersona() { return edadPersona; }
    public void setEdadPersona(String edadPersona) { this.edadPersona = edadPersona; }

    public String getDomicilioPersona() { return domicilioPersona; }
    public void setDomicilioPersona(String domicilioPersona) { this.domicilioPersona = domicilioPersona; }

    public String getTelefonoPersona() { return telefonoPersona; }
    public void setTelefonoPersona(String telefonoPersona) { this.telefonoPersona = telefonoPersona; }

    public String getDniPersona() { return dniPersona; }
    public void setDniPersona(String dniPersona) { this.dniPersona = dniPersona; }

    //Otros métodos
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Persona persona = (Persona) object;
        return  Objects.equals(nombreApellidoPersona, persona.nombreApellidoPersona) &&
                Objects.equals(dniPersona, persona.dniPersona) &&
                Objects.equals(telefonoPersona, persona.telefonoPersona) &&
                Objects.equals(domicilioPersona, persona.domicilioPersona) &&
                Objects.equals(edadPersona, persona.edadPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreApellidoPersona, dniPersona, telefonoPersona, domicilioPersona, edadPersona);
    }

    @Override
    public String toString() {
        return "Nombre y apellido: " + nombreApellidoPersona +  "\n" +
                "DNI: " + dniPersona + "\n" +
                "Teléfono: " + telefonoPersona + "\n" +
                "Domicilio: " + domicilioPersona + "\n" +
                "Edad: " + edadPersona + "\n";
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.edadPersona.compareTo(otraPersona.edadPersona);
    }
}
