import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Carrera implements Informacion{
    //Atributos
    //Siempre recordar que TODOS los atributos deben ser privados incluido las colecciones.
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    //Constructores

    public Carrera(String nombre) {
        this.nombre = nombre;
        coleccionMaterias=new LinkedList<>();
    }

    //Propiedades
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(LinkedList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    //Metodos
    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public void eliminarMateria(String nombreMateria){
        for (Materia materia:coleccionMaterias
             ) {
            if (nombreMateria.equals(materia.getNombre())){
                coleccionMaterias.remove(materia);
                System.out.println("Materia eliminada.");
            }
        }

    }

    public void encontrarMateria(String nombre){
        Scanner s=new Scanner(System.in);
        int selección;
        for (Materia materia:coleccionMaterias) {
            if (nombre.equals(materia.getNombre())){
                System.out.println("Materia encontrada.");
                try {
                    System.out.println("¿Desea eliminar la materia? 1.Si/2.No");
                    selección = s.nextInt();
                    if (selección == 1) {
                        coleccionMaterias.remove(materia);
                        System.out.println("Materia eliminada");
                    } else if (selección==2){
                        System.out.println("Materia no eliminada");
                    } else {
                        System.out.println("Opción inválida, intente de nuevo.");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Error en el ingreso de datos, intente de nuevo.");
                }
            }
        }
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }

    @Override
    public String listarContenidos() {
        TreeSet<String> listaNombresMaterias=new TreeSet<>();
        for (Materia materia:coleccionMaterias) {
            listaNombresMaterias.add(materia.getNombre());
        }
        return listaNombresMaterias.toString();
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
