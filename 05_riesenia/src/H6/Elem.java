package H6;
public class Elem<E> {
  private int prior;
  private E element;
  private Elem<E> next;
 
  public Elem(int new_prior, E new_element, Elem<E> new_next){
    prior = new_prior;
    next = new_next;
    element = new_element;
  }
 
  public int getPrior(){
      return prior;
  }
  public Elem<E> getNext(){
    return next;  
  }
  public E getElement(){
      return element;
  }
  public void setNext(Elem<E> new_next){
    next = new_next;  
  }
}