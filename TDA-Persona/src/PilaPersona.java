
/**
 *
 * @author isidro
 */
public class PilaPersona {

    private Persona[] personaV;
    private int tos;
    private final int VACIO = -1;

    public PilaPersona(int tam) {
        tos = -1;
        personaV = new Persona[tam];
    }//Constructor

    //Modularidad
    public boolean insertar(Persona p) {
        if (PilaLlena()) {
            return false;
        }
        tos++;
        personaV[tos] = p;
        return true;
    }

    public boolean eleminar() {
        if (PilaVacia()) {
            return false;
        }
        personaV[tos] = null;
        tos--;
        return true;
    }

    private boolean PilaLlena() {
        return tos == personaV.length - 1;
    }

    private boolean PilaVacia() {
        return tos == VACIO;
    }

    public String mostrarPersonas() {
        String cad = "";
        Persona dato;
        for (int i = 0; i <= tos; i++) {
            dato = personaV[i];
            cad = "[" + (i+1) + "] " + dato + "\n" + cad;
        }
        return cad;
    }
}
