import java.util.LinkedList;
import java.util.TreeSet;

public class Facultad implements Informacion{
    //Atributos
    private String nombre;
    private LinkedList<Carrera> coleccionCarreras;

    //Constructores
    public Facultad(String nombre) {
        this.nombre = nombre;
        coleccionCarreras=new LinkedList<>();
    }

    //Propiedades
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(LinkedList<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    //Metodos
    public void agregarCarrera(Carrera carrera){
        coleccionCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre){
        for (Carrera carrera:coleccionCarreras
             ) {
            if (nombre.equals(carrera.getNombre())){
                coleccionCarreras.remove(carrera);
                System.out.println("Carrera eliminada.");
            }
        }
    }

    public void eliminarEstudiante(Estudiante estudiante){
        //Ah shit, here we go again nested foreachs
        //Prestar mucha atencion a esta cagada
        //Siempre que querramos acceder a un atributo debemos acceder con el getter salvo que sea de la misma clase.
        //Anidamos para que recorra todas las colecciones y se elimine de todas.
        for (Carrera carrera:coleccionCarreras
             ) {
            for (Materia materia:carrera.getColeccionMaterias()
                 ) {
                for (Estudiante estudiantex: materia.getColeccionEstudiantes()
                     ) {
                    if (estudiantex.equals(estudiante)){
                        //estudiantex es el elemento que se recorre de la coleccion.
                        materia.getColeccionEstudiantes().remove(estudiante);
                    }
                }
            }
        }
    }

    @Override
    public int verCantidad() {
        return coleccionCarreras.size();
    }

    @Override
    public String listarContenidos() {
        TreeSet<String> listaNombresCarreras=new TreeSet<>();
        for (Carrera carrera:coleccionCarreras) {
            listaNombresCarreras.add(carrera.getNombre());
        }
        return listaNombresCarreras.toString();
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
