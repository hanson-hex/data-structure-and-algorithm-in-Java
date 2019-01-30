package Stack;

public class MyStack {
	private int maxSize;
	private int top;
	private int[] arrayStack;
	public MyStack(int max) {
		this.maxSize = max;
		this.top = -1;
		arrayStack = new int[max];
	}
	// 压入元素
	public void push(int value){
		if (top >= maxSize) {
			System.out.println("栈已经满了!");
		} else {
			arrayStack[++top] = value;
		}
	} 
	// 弹出元素
	public int pop() {
		return arrayStack[top--];
	}
	// 空栈？
	public boolean isEmpty() {
		return top == -1;
	}
	// 满栈？
	public boolean isFull() {
		return maxSize == top;
	}
	// 查看栈顶元素
	public int peek() {
		return arrayStack[top];
	}
	// 打印整个栈元素 从栈底开始
	public void display() {
		for(int i = 0; i <= top;i++) {
			System.out.print(arrayStack[i] + " ");
		}
	}
}
