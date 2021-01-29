package ed.exercicio;
import java.util.LinkedList;
import java.util.List;

public class Pilha{
  private List<String> lojacel = new LinkedList<String>();
  
  public void inserir (String cel){
    lojacel.add(cel);
  }
  
  public String remover(){
    return lojacel.remove(lojacel.size()-1);
  }
  
  public boolean vazia(){
    return lojacel.isEmpty();}
  
  @Override
  public String toString(){
    return lojacel.toString();
  }
}
