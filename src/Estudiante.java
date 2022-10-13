public class Estudiante extends Persona{
    //Constructor
    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }
    //Metodos


    @Override
    public String toString() {
        return "Estudiante: "+super.getNombre()+" "+super.getApellido()+" "+super.getLegajo();
    }
}
