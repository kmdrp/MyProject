import java.util.Stack;

/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {

	static int quest1(double d)  {
		// FIXME
		int result = ((int)Math.floor(d)/2);
		return result;
	}

	static boolean quest2(String s) {
		// FIXME
		Stack<Character> stack = new Stack();
		boolean isPair=true;
		int i;
		char[] input = s.toCharArray();
		for(i=0;i<input.length;i++) {
			char ch=input[i];
			switch(ch){
				case '[':stack.push(ch);break;
				case '{':stack.push(ch);break;
				case '(':stack.push(ch);break;
				case ']':if(stack.isEmpty()||(ch=stack.pop())!='[')isPair=false;break;
				case '}':if(stack.isEmpty()||(ch=stack.pop())!='{')isPair=false;break;
				case ')':if(stack.isEmpty()||(ch=stack.pop())!='(')isPair=false;break;
			}
			if(!isPair)break;
		}
		if(stack.isEmpty()&&i==input.length){
			isPair= true;
		}else{
			isPair=false;
		}
		return isPair;
	}
}
