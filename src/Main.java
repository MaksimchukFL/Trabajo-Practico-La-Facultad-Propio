public class Main {

    public static void main(String[] args) {
        Facultad facultad=new Facultad("UNNE");
        Carrera abogacia=new Carrera("Abogacia");
        Carrera economia=new Carrera("Economia");
        Profesor juan=new Profesor("Juan","Perez",1,1000,5);
        Profesor marcelo=new Profesor("Marcelo","Gonzales",2,2000,3);
        Estudiante pedro=new Estudiante("Pedro","Sanchez",10);
        Estudiante walter=new Estudiante("Walter","Guzman",11);
        Estudiante jose=new Estudiante("Jose","Benitez",12);
        Materia derecho=new Materia("Derecho",juan);
        Materia oratoria=new Materia("Oratoria",juan);
        Materia estadistica=new Materia("Estadistica",marcelo);


        facultad.agregarCarrera(abogacia);
        facultad.agregarCarrera(economia);
        abogacia.agregarMateria(derecho);
        abogacia.agregarMateria(oratoria);
        economia.agregarMateria(estadistica);
        derecho.agregarEstudiante(pedro);
        derecho.agregarEstudiante(jose);
        estadistica.agregarEstudiante(walter);
        oratoria.agregarEstudiante(pedro);
        /*
        abogacia.encontrarMateria("Oratoria");
        System.out.println(abogacia.listarContenidos());
        derecho.modificarTitular(marcelo);
        System.out.println(derecho.toString());

        pedro.modificarDatos();
        System.out.println(marcelo.calcularSueldo());


        System.out.println(derecho.listarContenidos());
        derecho.eliminarEstudiante("Pedro");
        System.out.println(derecho.listarContenidos());

        abogacia.encontrarMateria("Derecho");


        System.out.println(derecho.listarContenidos());
        System.out.println(oratoria.listarContenidos());
        facultad.eliminarEstudiante(pedro);
        System.out.println(derecho.listarContenidos());
        System.out.println(oratoria.listarContenidos());
        */







        /*Para ver mas adelante. En estos casos aparentemente el eliminar carreras, estudiantes, etc, los elimina de la colección, por lo tanto, no se si
        están bien aplicadas las relaciones entre clases dadas en el diagrama, eso consultaré con el profesor más adelante.
         */

    }
}
