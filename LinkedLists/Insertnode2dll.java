package LinkedLists;

public class Insertnode2dll {
    public static class Node{
	  public int data;
      public Node next;
      public Node back;

    public Node(int data1, Node next1, Node back1){
       data = data1;
       next = next1;
       back = back1;
    }

    public Node(int data1){
        data = data1;
        next = null;
        back = null;
    }
}

 private static Node convertarr2dll(int [] arr){
      Node head = new Node(arr[0]);
      Node prev = head;

       for (int i = 1; i < arr.length; i++) {
           Node temp = new Node(arr[i], null, prev);
           prev.next = temp;
           prev = temp;
       }
       return head;
    }
  
    private  static void print(Node head){
      while(head != null){
        System.out.print(head.data +" ");
        head = head.next;
      }
      System.out.println();
    }
      // To insert new node value at tail
    private static Node insertatTail(Node head, int k){
        Node newNode = new Node(k);

        if(head == null){
            return newNode;
        }

        Node current = head;
        while (current.next != null) { 
            current = current.next;
        }

        current.next = newNode;
        newNode.back = current; 
        return head;
    }
     public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //int val = 5;
        Node head = convertarr2dll(arr);
        System.out.println("Doubly LinkedList Initially : ");
        print(head);

        System.out.println("Doubly LinkedList after inserting value at tail : ");
        head = insertatTail(head, 10);
        print(head);
    }
}
