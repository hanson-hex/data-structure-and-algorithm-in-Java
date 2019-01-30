package testStack;

import Stack.MyStack;
import calSuffix.CalSuffix;
import charStack.CharStack;
import enhanceStack.EnhanceStack;
import infixToSuffix.InfixToSuffix;


/**
 * 　①、栈的实现初始化容量之后，后面是不能进行扩容的（虽然栈不是用来存储大量数据的），如果说后期数据量超过初始容量之后怎么办？（自动扩容）

　　②、我们是用数组实现栈，在定义数组类型的时候，也就规定了存储在栈中的数据类型，那么同一个栈能不能存储不同类型的数据呢？（声明为Object）

　　③、栈需要初始化容量，而且数组实现的栈元素都是连续存储的，那么能不能不初始化容量呢？（改为由链表实现）
 
**/

public class TestStack {
	public static void start() {
//		testCommonStack();
//		testEnhanceStack();
//		testInfixToSuffix();
//		testCalSuffix();
//		testMatchBracket();
//		testReverseStr();
	}
	/**
	 * 简单数字栈
	 */
	public static void testCommonStack() {
		MyStack mStack = new MyStack(5);
		mStack.push(3);
		mStack.push(4);
		mStack.display();
	}
	/**
	 * 增强的栈 1.可以扩展空间 2.可以传入对象
	 */
	public static void testEnhanceStack() {
		EnhanceStack eStack = new EnhanceStack(3);
		eStack.push(4);
		eStack.push("dfhdsi");
		eStack.push("lq");
		while (!eStack.isEmpty()) {
			System.out.println(eStack.pop());
			
		}
	}
	/**
	 * 中缀表达式转换成后缀表达式
	 */
	public static void testInfixToSuffix() {
		String str = "A*(B+C)-D/(E+F)";
		InfixToSuffix s1 = new InfixToSuffix(str);
		CharStack res = s1.doTrans();
	}
	/** 
	 * 后缀表达式计算结果
	 */
	public static void testCalSuffix() {
		String input = "123+*523+/-";
		CalSuffix cSuffix = new CalSuffix(input);
		System.out.println(cSuffix.doCal());
	}
	public static void testMatchBracket() {
		String str = "<abc[123]abc}";
		matchBraket(str);
	}
	/**
	 * 测试括号是否匹配
	 * @param str
	 */
	public static void matchBraket(String str) {
		EnhanceStack myStack = new EnhanceStack(2);
		char[] cArray = str.toCharArray();
		for(char ch: cArray) {
			switch (ch) {
			case '<':
			case '[':
			case '{':
				myStack.push(ch);
				break;
			case '>':
			case ']':
			case '}':
				if (!myStack.isEmpty()) {
					char topCh = myStack.pop().toString().toCharArray()[0];
					if (topCh == '<' && ch != '>' || topCh == '[' && ch != ']' || topCh == '{' && ch != '}') {
						System.out.print("括号" + topCh + "与" + ch + "不匹配");
					}
				}
			default:
				break;
			}
		}
		if (!myStack.isEmpty()) {
			System.out.println("括号不成对");
		}
	}
	public static void testReverseStr() {
		String str = "hello world";
		reverseStr(str);
	}
	/**
	 * 逆序字符串
	 * @param str
	 */
	public static void reverseStr(String str) {
		EnhanceStack myStack = new EnhanceStack(2);
		char[] strArray = str.toCharArray();
		for(char c: strArray) {
			myStack.push(c);
		}
		while(!myStack.isEmpty()) {
			System.out.print(myStack.pop());
		}
	}

}


