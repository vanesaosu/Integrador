
package metodosinretornoconparametro;


public class MetodoSinRetornoConParametro {

    
    public static void main(String[] args) {
        MetodoSinRetornoConParametro m1 = new MetodoSinRetornoConParametro();
        m1.suma(5, 5);
        m1.resta(20, 5);
        m1.multiplicacion(16, 2);
        m1.division(5, 5);
        
    }
    
    public void suma(int a, int b){
        System.out.println("Operacion");
        System.out.println("1. Suma");
        int resultado = a+b;
        System.out.println("El resultado es: "+ resultado);
    }
    
    public void resta(int a, int b){
        System.out.println("Operacion");
        System.out.println("2. Resta");
        int resultado = a-b;
        System.out.println("El resultado es: "+ resultado);
    }
    
    public void multiplicacion(int a, int b){
        System.out.println("Operacion");
        System.out.println("3. Multiplicacion");
        int resultado = a*b;
        System.out.println("El resultado es: "+ resultado);
    }
    public void division(int a, int b){
        System.out.println("Operacion");
        System.out.println("4. Division");
        int resultado = a/b;
        System.out.println("El resultado es: "+ resultado);
    }
    
    
}
