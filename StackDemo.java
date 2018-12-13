import java.util.Scanner;
public class StackDemo {
  static int option;
  static int counter = -1;
  static int size = 5;
  static int stack[] = new int[size];
  public static void main(String[] args) {
  while(true){
    System.out.println("Select your Operation");
    System.out.println("1 - PUSH");
    System.out.println("2 - POP");
    System.out.println("3 - STACK");
    System.out.println("4 - EXIT");
    Scanner s = new Scanner(System.in);
    option  =s.nextInt();
    switch(option) {
      case 1:
      System.out.println("Enter an element to Push");
      int element = s.nextInt();
      push(element);
      break;
      case 2:
      pop();
      break;
      case 3:
      print();
      case 4:
      return;
      default:
        System.out.println("Select Correct Option");
    }
  }
}
static void push(int element) {
  if(counter==size) {
    System.out.println("Stack Overflow");
  }
  else {
   counter = counter+1;
   stack[counter] = element;
}
}
static void pop() {
  if(counter<0) {
    System.out.println("Stack Underflow");
  }
  else {
    int save ;
    save = stack[counter];
    counter = counter-1;
  }
}
static void print() {
  if(counter<0) {
    System.out.println("Stack Underflow");
  }
  if(counter>=size) {
    System.out.println("Stak Overflow");
  }
  else {
    for (int i=0;i<=counter;i++) {
      System.out.println(stack[i]);
    }
  }
}
}
