package myPack;

public interface Stack {
	void push(int pushedElement);
	int pop();
}
 class FixedStack implements Stack{
	 private static  int capacity[];
	 int top;
	 
	 FixedStack(int size){
		 capacity = new int[size];
		 top = -1;
	 }

	 public void push(int pushedElement) {
	  if (top < capacity.length - 1) {
	   top++;
	   capacity[top] = pushedElement;
	   System.out.println("Element " + pushedElement
	     + " is pushed to Stack !");
	   printElements();
	  } else {
	   System.out.println("Stack Overflow !");
	  }
	 }

	  public int pop() {
	  if (top >= 0) {
	   top--;
	   System.out.println("Pop operation done !");
	   return 0;
	  } else {
	   System.out.println("Stack Underflow !");
	   return 0;
	  }
	 }
	  
	  public void printElements() {
		  if (top >= 0) {
		   System.out.println("Elements in stack :");
		   for (int i = 0; i <= top; i++) {
		    System.out.println(capacity[i]);
		   }
		  }
	 }
  
	 public  static void main(String[] args) {
		 FixedStack stackDemo = new FixedStack(3);

	    stackDemo.pop();
		stackDemo.push(23);
		stackDemo.push(2);
		stackDemo.push(73);
		stackDemo.push(11);
		stackDemo.push(21);
		stackDemo.pop();
		stackDemo.pop();
	   
	 }
	 
}
 