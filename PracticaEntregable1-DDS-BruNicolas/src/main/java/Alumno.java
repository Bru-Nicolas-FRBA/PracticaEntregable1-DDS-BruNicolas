import java.util.List;
import java.util.ArrayList;

public class Alumno {
    public String nombreAlumno;
    public List<Materia> materiasCursadas;
    public List<Materia> materiasParaInscribirse;

    public void solicitarInscripcion(){
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.realizarInscripcion(this);
        System.out.println( "Alumno: " + this.nombreAlumno + " solicito inscripcion: \n");
    }
}
