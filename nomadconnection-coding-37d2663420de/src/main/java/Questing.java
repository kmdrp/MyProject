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
		int large=0,mid=0,small=0;

		char[] braces = s.toCharArray();
		for(int i=0;i<braces.length;i++) {
			if(braces[i]=='['){
				large++;

			}else if (braces[i] == '{') {
				mid++;
			}else if(braces[i]=='('){
				small++;
			}else if(braces[i]==']'){
				if(large>0){
					large--;
				}else{
					break;
				}
					}else if(braces[i]=='}'){
				if(mid>0){mid--;}else{break;}
			}else if(braces[i]==')'){
				if(small>0){small--;}else{break;}
			}

		}

		if(large==0&&mid==0&&small==0){
			return true;
		}else{
			return false;
		}
	}
}
