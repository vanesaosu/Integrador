
package metodoconretorno;


public class MetodoConRetorno {

    public static void main(String[] args) {
        MetodoConRetorno objeto = new MetodoConRetorno();
        System.out.println(objeto.saludando());
    }
    
    
    public String saludando(){
         String aprendiendo = "Que tal, me llamo Vanesa";
         
         return "Hola" + aprendiendo;
    }
    
}
