
package tostring;

public class Persona {
    private String nombre;
    private String apellido;
    private double peso;
    private double altura;
    private int edad;
    
    

    public Persona(String nombre, String apellido, double peso, double altura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + ", altura=" + altura + ", edad=" + edad + '}';
    }
    
    
    
    
}
