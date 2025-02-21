import model.Alumno;
import model.Curso;

public class Main {

    public static void main(String[] args) {

        //Creando un objeto desde un constructor vacio
        Curso objCurso = new Curso();
        objCurso.setIdcurso(1);
        System.out.println(objCurso.getIdcurso());
        //Creando un objeto desde un constructor con parametros
        Curso objCurso2 = new Curso(2);
        System.out.println(objCurso2.getIdcurso());

        Alumno objAlumno = new Alumno();
        objAlumno.setApellido("Ramos");
        System.out.println(objAlumno.getApellido());

    }


}