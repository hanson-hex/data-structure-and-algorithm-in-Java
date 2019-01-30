package calSuffix;

import Stack.MyStack;

public class CalSuffix {
	private MyStack stack;
    private String input;
     
    public CalSuffix(String input){
        this.input = input;
        stack = new MyStack(input.length());
         
    }
     
    public int doCal(){
        int num1,num2,result;
        for(int i = 0 ; i < input.length() ; i++){
            char c = input.charAt(i);
            if(c >= '0' && c <= '9'){
                stack.push((int)(c-'0'));//如果是数字，直接压入栈中
            }else{
                num2 = stack.pop();//注意先出来的为第二个操作数
                num1 = stack.pop();
                switch (c) {
                case '+':
                    result = num1+num2;
                    break;
                case '-':
                    result = num1-num2;
                    break;
                case '*':
                    result = num1*num2;
                    break;
                case '/':
                    result = num1/num2;
                    break;
                default:
                    result = 0;
                    break;
                }
                 
                stack.push(result);
            }
        }
        result = stack.pop();
        return result;
    }
}
