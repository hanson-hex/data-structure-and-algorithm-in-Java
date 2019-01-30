package infixToSuffix;

import charStack.CharStack;


public class InfixToSuffix {
	private CharStack s1; // 操作符栈
	private CharStack s2; // 结果栈
	private String input;
	public InfixToSuffix(String in) {
		this.input = in;
		this.s1 = new CharStack(in.length());
		this.s2 = new CharStack(in.length());
	}
	public CharStack doTrans() {
		for (int i = 0; i < input.length(); i++) {
			System.out.print("当前操作符");
			s1.displayStack();
			System.out.print("当前实时结果");
			s2.displayStack();
			char ch = input.charAt(i);
			switch (ch) {
			case '(':
				s1.push(ch);
				break;
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case ')':
				gotParen();
				break;
			default:
				s2.push(ch);
				break;
			}
		}
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2;
	}
	/**
	 * 处理操作符
	 * @param opeThis 操作数
	 * @param pri 该运算符优先级
	 */
	public void gotOper(char operThis, int pri1) {
		if (!s1.isEmpty()) {
			char topOper = s1.peek();
			int pri2;
			if (topOper == '*' || topOper == '/') {
				pri2 = 2;
			} else if (topOper == '(') {
				pri2 = 0;
			} else {
				pri2 = 1;
			}
			if (pri1 < pri2) {
				s1.pop();
				s2.push(topOper);
			}
		}
		s1.push(operThis);
	}
	public void gotParen() {
		while(!s1.isEmpty()) {
			char topItem = s1.pop();
			if (topItem != '(') {
				s2.push(topItem);
			} else {
				break;
			}
		}
	}
}
