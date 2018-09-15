/**
	Stack class
	Ethan Chen

	Guide from Geeks for Geeks: 
	https://www.geeksforgeeks.org/stack-data-structure-introduction-program/
**/
public class Stack {
	
	//Size of the stack
		static final int MAX = 1000;
		int top;
		int a[] = new int[MAX]; //Maximum size of Stack

		//Returns true if stack is empty; false otherwise.
		boolean isEmpty() {
			return(top < 0);
		}
		Stack() {
			top = -1;
		}

		// Adds an item in the stack. If the stack is full
 		// then it is said to be an Overflow condition.
		boolean push(int x) {
			if(top >= (MAX - 1)) {
				System.out.println("Stack Overflow");
				return false;
			}
			else {
				a[++top] = x;
				return true;
			}
		}

		// Removes an item from the stack. The items are Popped
		// in the reversed order in which they are pushed. If the
		// stack is empty, then it is said to be an Underflow condition.
		int pop() {
			if(top < 0) {
				System.out.println("Stack Underflow");
				return 0;
			}
			else {
				int x = a[top--];
				return x;
			}
		}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		while(!s.isEmpty()) {
			System.out.println(s.pop() + " Popped from Stack");
		}

	}

}
