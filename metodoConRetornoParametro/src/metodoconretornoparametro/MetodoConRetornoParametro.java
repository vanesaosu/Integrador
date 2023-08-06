
package metodoconretornoparametro;


public class MetodoConRetornoParametro {

    
    public static void main(String[] args) {
       MetodoConRetornoParametro objeto = new MetodoConRetornoParametro();
       System.out.println(objeto.anioNac(1994));
    }
    public int anioNac(int anio){
       return anio; 
    }
    
}
