package ed.exercicio;
import java.util.LinkedList;
import java.util.Queue;

public class FilaTeste {
  
  public static void main(String[] args) {
    Fila fila = new Fila();
    
    fila.inserir("Iphone12");
    
    System.out.println(fila);
    
    fila.inserir("MotorolaG6");
    fila.inserir("SamsungGalaxyM21s");
    
    System.out.println(fila);
    
    fila.remover();
    
    System.out.println(fila);
    
    fila.remover();
    System.out.println(fila.vazia());
    
    System.out.println(fila.remover());
    
    System.out.println(fila.vazia());
    System.out.println(fila);
    
    Queue<String> filaJava = new LinkedList<String>();
    filaJava.add("Primeiro");
    System.out.println(filaJava.poll());
    System.out.println(filaJava);
  }
}