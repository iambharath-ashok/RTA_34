package day4.collections.list.linkedlist.customlinkedlist;

import day1.oopsconcepts.interfaces.Vehicle;

public class CustomLinkedList {

    private Node<Integer> head;


    public CustomLinkedList() {
        this.head = null;
    }


    //Add node to the LinkedList
    public void add(int data) {
        Node<Integer> newNode = new Node<>(data);

        if(head == null ) {
            this.head = newNode;
        } else {

            Node<Integer> currentHead = head;
            while (currentHead.next != null) {
                currentHead = currentHead.next;
            }
            currentHead.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node<Integer> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node<Integer> currentHead = head;
        if(currentHead == null) {
            System.out.println("List is empty");
            return;
        }
        // Start traversing till the end
        while(currentHead != null) {
            System.out.print(currentHead.data + " -> ");
            currentHead = currentHead.next;
        }
        System.out.println("null");
    }


    public void remove(int data) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.data == data) { // if the head node is the node to be removed
            head = head.next; // move the head to the next node
        }

        Node<Integer> tempCurrent = head;
        while(tempCurrent.next != null && tempCurrent.next.data != data) {// Travers the list to find the node to be removed
            tempCurrent = tempCurrent.next;
        }

        if(tempCurrent.next != null) {
            tempCurrent.next = tempCurrent.next.next;
        } else {
            System.out.println("Element Not found");
        }
    }

}


class CustomLinkedListExecutor {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();

        customLinkedList.add(10);
        customLinkedList.add(30);
        customLinkedList.add(40);

        customLinkedList.printList();

        customLinkedList.addFirst(20);

        customLinkedList.printList();
        customLinkedList.addFirst(10);

        customLinkedList.printList();

        customLinkedList.remove(30);
        customLinkedList.printList();
    }


}
