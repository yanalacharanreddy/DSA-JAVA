import java.util.*;

public class Main {
    public static void main(String[] args) {
      DoubleLinkedList dll=new DoubleLinkedList();
      // Inserting an element 10 at InsertAtBegin
      System.out.println("Inserting 10 at the begining");
      dll.InsertAtBegin(10);
      dll.Display();
      System.out.println("Inserting 60 at the end");
      dll.InsertAtEnd(60);
      dll.Display();
      System.out.println("Inserting 30 at the position 2");
      dll.InsertAtPosition(2,30);
      dll.Display();
      System.out.println("Inserting 40 at the position 3");
      dll.InsertAtPosition(3,40);
      dll.Display();
       System.out.println("Inserting 5 at the begining");
      dll.InsertAtBegin(5);
      dll.Display();
      System.out.println("Inserting 69 at the end");
      dll.InsertAtEnd(69);
      dll.Display();
      System.out.println("Deleting at begining");
      dll.DeleteAtBegin();
      dll.Display();
      System.out.println("Deleting at end");
      dll.DeleteAtEnd();
      dll.Display();
      System.out.println("Deleting at position 3");
      dll.DeleteAtPosition(3);
      dll.Display();
      System.out.println();
      dll.DisplayHt();
  }
}

class Node{
  int data;
  Node prev=null;
  Node next=null;
}

class DoubleLinkedList{
  Node head=null;
  Node tail=null;
  Node temp=null;
  public void InsertAtBegin(int data){
      Node newnode=new Node();
      newnode.data=data;
      if(head==null){
        head=newnode;
        tail=newnode;
      }
      else{
        newnode.next=head;
        newnode.prev=null;
        head=newnode;
      }
      
  }
  
  public void InsertAtPosition(int pos, int data) {
      Node temp = head;
      for (int i = 0; i < pos - 2; i++) {
          temp = temp.next;
      }
      Node newnode = new Node();
      newnode.data = data;
      newnode.next = temp.next;
      newnode.prev = temp;
      if (temp.next != null) {
          temp.next.prev = newnode;
      }
      temp.next = newnode;
  }

  public void InsertAtEnd(int data){
      Node newnode=new Node();
      newnode.data=data;
      if(tail==null){
        System.out.println("List is Empty");
        return ;
      }
      newnode.prev=tail;
      newnode.next=null;
      tail.next=newnode;
      tail=newnode;
  }
  
  public void DeleteAtBegin(){
    head=head.next;
    head.prev=null;
  }
  
  public void DeleteAtPosition(int pos){
    Node temp = head;
      for (int i = 0; i < pos - 2; i++) {
          temp = temp.next;
      }
      temp.next.prev=temp;
      temp.next=temp.next.next;
  }
  public void DeleteAtEnd(){
    tail=tail.prev;
    tail.next=null;
  }
  
  public void DisplayHt(){
    System.out.println("Head is at -> "+head.data +" : "+"Tail is at -> "+tail.data);
  }
  
  public void Display(){
    temp=head;
    while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.print("NULL");
    System.out.println();
  }
}
