// src/LinkedList.java
public class Linkedlist {
    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int key) {
        Node temp = head, prev = null;
    
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
    
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
    
        if (temp == null) return;
    
        prev.next = temp.next;
    }
    
    
}
