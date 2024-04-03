import java.util.List;

public class Inscripcion {

    public Boolean realizarInscripcion(Alumno alumno) {
        System.out.println( "Alumno: " + alumno.nombreAlumno + " realizando inscripcion: \n");
        for(Materia materia : alumno.materiasParaInscribirse)
       {
           if(alumnoCursoCorrelativas(alumno, materia) && materia.aprobada)
               System.out.println( "Inscripcion a materia '" + materia.nombreMateria + "' aprobada \n");
           else
           {
               System.out.println( "Inscripcion a materia '" + materia.nombreMateria + "' rechazada \n");
               return false;
           }
       }
        return true;
    }

    private boolean alumnoCursoCorrelativas(Alumno alumno, Materia materia) {
        return alumno.materiasParaInscribirse.containsAll(materia.materiasCorrelativas);
    }

}
