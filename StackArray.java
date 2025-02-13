import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Stack obj=new Stack();
    System.out.println("\n----WELCOME TO STACK OPERATIONS----");
    System.out.println("Enter 1 to PUSH an element into Stack");
    System.out.println("Enter 2 to POP an element from Stack");
    System.out.println("Enter 3 to PEEK into Stack");
    System.out.println("Enter 4 to Display all elements in Stack");
    System.out.println("Enter 5 to EXIT\n");

    while (true){
      
        System.out.print("Enter you choice :- ");
        int ip=sc.nextInt();
        if(ip == 1){
            System.out.print("Enter your push value :-");
            int data = sc.nextInt();
            obj.push(data);
        }
        else if(ip == 2){
          obj.pop();
        }
        else if(ip == 3){
          
          obj.peek();
        }
        else if(ip == 4) {
          
            obj.display();
        }
        else if(ip == 5){
          
            System.out.print("You have Exited the Program");
            break;
        }
        else
            System.out.print("Invalid Choice ");
    }
  }
}

class Stack{
  int[] stack=new int[20];
  int index=0;
  
  public void push(int data){
    if(index>=stack.length) System.out.println("Stack OverFlow");
    System.out.println(data+" is pushed into stack");
    stack[index]=data;
    index++;
  }
  
  public void pop(){
    if(index<0) System.out.println("Stack UnderFlow");
    System.out.println(stack[--index]+" is popped from the stack");
  }
  
  public void peek(){
    
   System.out.println("top is at : "+index);
  }
  
  public void display(){
    for(int i=0;i<index;i++){
      System.out.println("| "+stack[i]+" |");
    }
  }
}
