package LinkedLists;

public class DeletenodeinDLL {
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
}
