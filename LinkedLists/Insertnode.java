package LinkedLists;

import java.util.Arrays;
import java.util.List;

 class Node{
	public int data;
    public Node next;

    public Node(int data1, Node next1){
       data = data1;
       next = next1;
    }

    public Node(int data1){
        data = data1;
        next = null;
    }
}

public class Insertnode{
   public static void printLL(Node head){
      while(head != null){
        System.out.print(head.data +" ");
        head = head.next;
      }
    }
      public static Node insertHead(Node head, int val){
       Node temp = new Node(val, head);
       return temp; 
    }
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0,1,2,3);
        int val = 5;

        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        head = insertHead(head, val);

        printLL(head);
    }
}
