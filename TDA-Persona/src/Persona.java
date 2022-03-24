//Realizar un software que permita INSERTAR, MOSTRAR y ELIMINAR datos de un vector
//con celdillas tipo PERSONA, GRABAR un video de 5 a 10 minutos mostrando el codigo 
//y ejecutarlo para mostrar su funcionamiento

public class Persona {
    
    private String nombre;
    private String domicilio;
    private String telefono;
    private int edad;
    
    //constructor;
    public Persona(String nombre, String domicilio, String telefono, int edad) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.edad = edad;
        System.out.println("Persona creada");
    }

    //get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        System.out.println("Hola");
        return "Nombre: "+this.getNombre()+" Domicilio: "+this.getDomicilio()+" Telefono: "+this.getTelefono()+" Edad: "+this.getEdad();
    }
}
