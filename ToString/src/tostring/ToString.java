
package tostring;


public class ToString {

   
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan","Krnacs", 75.5, 1.85, 28);
        Persona persona2 = new Persona("Mariana","Rodriguez", 75.5, 1.65, 27);
        Persona persona3 = new Persona("Carmen","Medina", 70.5, 1.80, 48);
        Persona persona4 = new Persona("Sergio","Medina", 90.5, 1.90, 26);
        Persona persona5 = new Persona("Belen","Tarnva", 64.5, 1.64, 25);
        
        System.out.println(persona1.toString());
        System.out.println(persona3.toString());
        System.out.println(persona5.toString());
        
    }
    
}
