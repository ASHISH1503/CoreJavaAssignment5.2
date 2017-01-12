package myPack;

class VariableStack implements Stack{
		 private  static int capacity[];
		 int top;
		 
		 VariableStack(int size){
			 capacity = new int[size];
			 top = -1;
		 }
		 public void push(int pushedElement) {
			  if (top < capacity.length - 1) {
				   top++;
				   capacity[top] = pushedElement;
				   System.out.println("Element " + pushedElement
				     + " is pushed to Stack !");
				   printElements2();
				  } else {
				   System.out.println("the stack automatically grows to accommodate the new element.");
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

public void printElements2() {
 if (top >= 0) {
  System.out.println("Elements in stack :");
  for (int i = 0; i <= top; i++) {
   System.out.println(capacity[i]);
  }
 }
}
  
public  static void main(String[] args) {
	VariableStack stackDemo2 = new VariableStack(3);
	stackDemo2.push(11);
	stackDemo2.push(22);
	stackDemo2.push(33);
	stackDemo2.push(44);
	stackDemo2.push(55);
}

}

