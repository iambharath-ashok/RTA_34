package day4.collections.list.linkedlist.customlinkedlist;


// T is a Generic Type that can hold data of any type
public class Node<T> {

    T data;//Generics to hold/support all the types of Data
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

  

}
