// 2) Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его, 
//first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;

public class MyQueue {
    
    int countAdd;
    int countPop;
    LinkedList <Integer> ll;
    
    public MyQueue(){
        countAdd=-1;
        countPop =0;
        ll = new LinkedList<Integer>();
    }
    public void enqueue(int element){
        ll.add(countAdd+1,element);
        countAdd++;
        
    }
    public int dequeue(){
      if(countAdd>=0){
        int searchElement=ll.get(countPop);
        ll.remove(ll.get(countPop));
        countAdd--;
        return searchElement;
      }
      else{
        throw new IllegalStateException("Очередь пуста!");
      }
     
    }    
     public int first(){
        if(countAdd>=0){
            return ll.get(countPop);
        }
        else{
        throw new IllegalStateException("Очередь пуста!");
      }
        
    }
    public int lenQueue (){
        return countAdd+1;
    }
    
    
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(3);
        myQueue.enqueue(10);
        myQueue.enqueue(28);
        myQueue.enqueue(45);
        
        System.out.println(myQueue.ll);
       // System.out.println("Элемент 3 находится под номером " + myQueue.countAdd);
        System.out.println("Размер очереди " + myQueue.lenQueue());
        System.out.println("Первый элемент сейчас в очереди на выдачу " + myQueue.dequeue() + ". Мы его удаляем") ;
        System.out.println("Размер очереди после применения метода dequeue() " + myQueue.lenQueue());
        System.out.println(myQueue.ll);
        System.out.println("Первый элемент в очереди сейчас "+myQueue.first() + ". После применения метода first() остается на своем месте ");
        System.out.println(myQueue.ll);
        System.out.println("Применяем 4 раза метод удаления первого элемента, чтоб проверить на работу с пустой очередью");
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.first();



    }

}
