import java.util.ArrayList;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Test {

    public void inscripcionBien() {

        Alumno alumno = new Alumno();
        alumno.nombreAlumno = "Bru";
        alumno.materiasParaInscribirse = new ArrayList<>();

        Materia materia1 = new Materia();
        materia1.nombreMateria = "Filosofia";
        materia1.aprobada = true;

        Materia materia2 = new Materia();
        materia2.nombreMateria = "Arte";
        materia2.aprobada = true;

        Materia materia3 = new Materia();
        materia3.nombreMateria = "Diseño De Sistemas";
        materia3.aprobada = true;

        Materia materia4 = new Materia();
        materia4.nombreMateria = "Vida";

        materia4.materiasCorrelativas.add(materia1);
        materia4.materiasCorrelativas.add(materia2);
        materia4.materiasCorrelativas.add(materia3);

        alumno.materiasParaInscribirse.add(materia4);

        Inscripcion inscripcion = new Inscripcion();

        assertTrue(inscripcion.realizarInscripcion(alumno));
    }

    public void inscripcionMal() {

        Alumno alumno = new Alumno();
        alumno.nombreAlumno = "Bru";
        alumno.materiasParaInscribirse = new ArrayList<>();

        Materia materia1 = new Materia();
        materia1.nombreMateria = "Facha";
        materia1.aprobada = false;

        Materia materia2 = new Materia();
        materia2.nombreMateria = "Carisma";
        materia2.aprobada = false;

        Materia materia3 = new Materia();
        materia3.nombreMateria = "Inteligencia";
        materia3.aprobada = false;

        Materia materia4 = new Materia();
        materia4.nombreMateria = "Ayudantia de Diseño de Sistemas";

        materia4.materiasCorrelativas.add(materia1);
        materia4.materiasCorrelativas.add(materia2);
        materia4.materiasCorrelativas.add(materia3);

        alumno.materiasParaInscribirse.add(materia4);

        Inscripcion inscripcion = new Inscripcion();

        assertFalse(inscripcion.realizarInscripcion(alumno));
    }

}
