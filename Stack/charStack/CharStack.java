package charStack;

public class CharStack {
	private char[] arrayStack;
	private int top;
	private int maxSize;

	public CharStack(int max) {
		this.maxSize = max;
		this.top = -1;
		arrayStack = new char[max];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return maxSize - 1 == top;
	}

	public void push(char ch) {
		if (isFull()) {
			System.out.println("栈满了");
			return;
		}
		arrayStack[++top] = ch;
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("栈为空");
			return '\0';
		}
		char topItem = arrayStack[top];
		arrayStack[top--] = '\0';
		return topItem;
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("栈为空");
			return '\0';
		}
		return arrayStack[top];
	}

	public char peekN(int n) {
		if (isEmpty()) {
			System.out.println("栈为空");
			return '\0';
		}
		if (n < 0 && n > top) {
			System.out.println("下表过界");
			return '\0';
		}
		return arrayStack[n];
	}

	public void displayStack() {
		System.out.println("栈从底到顶依次是:");
		for (int i = 0; i <= top; i++) {
			System.out.print(arrayStack[i]);
		}
		System.out.println("");
	}
}
