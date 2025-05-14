import java.util.*;

interface Stack{

public void push();
	
	public void pop();
	
	public void display();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
}
 class IntegerStack implements Stack{
  Scanner scan = new Scanner(System.in);
    
    public int size;
    public int top ;
    public int[] stack ;

  
    public IntegerStack(int size) {
        this.size = size;
        this.top = -1;
        this.stack = new int[size];
    }
    @Override
  public void push() {
        if (top == size - 1) {
            System.out.println("Stack is full.");
        } else {
            System.out.print("Enter the element to be pushed in stack: ");
            int element = scan.nextInt();
            top++;
            stack[top] = element;
            System.out.println(element + " is pushed into the stack.");
        }
    }
    @Override
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
        } else {
            int ele = stack[top];
            System.out.println(ele + " is removed from the stack.");
            top--;
        }
    }
    @Override
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty. No elements to display.");
        } else {
            System.out.println("Stack elements (top to bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i] + " ");
            }
            System.out.println();
        }
    }
    @Override
     public boolean isFull() {
        return top == size - 1;
    }
    @Override
     public boolean isEmpty() {
        return top == -1;
    }

}

  class Interface {
public static void main(String[] args){
 Scanner scan = new Scanner(System.in);
 
 System.out.print(" enter the size of the stack: ");
  int stacksize =scan.nextInt();
  
  IntegerStack ob1 = new IntegerStack(stacksize);
  int choice;
        
        do {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Check if Stack is Empty");
            System.out.println("5. Check if Stack is Full");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    ob1.push();
                    break;
                case 2:
                    ob1.pop();
                    break;
                case 3:
                    ob1.display();
                    break;
                case 4:
                    System.out.println("Is stack empty? " + ob1.isEmpty());
                    break;
                case 5:
                    System.out.println("Is stack full? " + ob1.isFull());
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scan.close();

}
}
