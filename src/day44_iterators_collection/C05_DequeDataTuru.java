package day44_iterators_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C05_DequeDataTuru {
    public static void main(String[] args) {


        Deque<String> deque = new LinkedList<>();
        deque.add("Cavidan");
        deque.add("Mesut");
        deque.add("Selim");
        deque.add("Tevfik");
        deque.add("Selim");
        System.out.println("deque = " + deque);// [Cavidan, Mesut, Tevfik, Selim]
        deque.removeLastOccurrence("Selim"); // sondaki Selimi sildi.
        System.out.println("deque = " + deque); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println("deque.pop() = " + deque.pop()); //deque.pop() = Cavidan

        //linkedlist ın basındakı elementı donduur

        deque.remove();
        deque.removeFirst();
        deque.removeLast();
    }}
// Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var