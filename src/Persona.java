import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Persona {
    //Atributos
    String nombre;
    String apellido;
    int legajo;

    //Constructor
    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //Propiedades
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    //Metodos

    public void modificarDatos(){
        int seleccion;
        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese el dato a modificar: ");
        System.out.println("1.Nombre");
        System.out.println("2.Apellido");
        System.out.println("3.Legajo");
        seleccion=s.nextInt();

        int legajo;
        String nombre,apellido;
        Scanner o=new Scanner(System.in);
        switch(seleccion){
            case 1:
                try {
                    System.out.println("Ingrese el nuevo nombre: ");
                    nombre = o.nextLine();
                    setNombre(nombre);
                    System.out.println("Cambios realizados. Los datos ahora son: " + getApellido() + "," + getNombre() + " legajo nº: " + getLegajo());
                } catch (InputMismatchException e){
                    System.out.println("Error en el ingreso de datos, intente de nuevo");
                }
                break;
            case 2:
                try {
                    System.out.println("Ingrese el nuevo apellido: ");
                    apellido = o.nextLine();
                    setApellido(apellido);
                    System.out.println("Cambios realizados. Los datos ahora son: " + getApellido() + "," + getNombre() + " legajo nº: " + getLegajo());
                } catch (InputMismatchException e){
                    System.out.println("Error en el ingreso de datos, intente de nuevo");
                }
                break;
            case 3:
                try {
                    System.out.println("Ingrese el nuevo legajo: ");
                    legajo=o.nextInt();
                    setLegajo(legajo);
                    System.out.println("Cambios realizados. Los datos ahora son: "+getApellido()+","+getNombre()+" legajo nº: "+getLegajo());
                } catch (InputMismatchException e){
                    System.out.println("Error en el ingreso de datos, intente de nuevo");
                }
                break;
            default:
                System.out.println("Error en el ingreso de datos, intente de nuevo.");
        }

    };

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    }

}
