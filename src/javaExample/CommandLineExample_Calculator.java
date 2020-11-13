package javaExample;

public class CommandLineExample_Calculator {

	public static void main(String[] args) { // 커맨드라인 argument지정은 우클릭-> run as -> run configuration -> arguments탭에 타이핑
		// argument 입력시 argument간에 ' '띄어쓰기 필수!
		
		// TODO Auto-generated method stub
		if (args.length !=3) {
	         System.out.println("usage: java ArrayEx15 NUM1 OP NUM2");
	         System.exit(0);
	      }

	      int num1 = Integer.parseInt(args[0]);   // 문자열을 숫자로 변환한다.
	      char op = args[1].charAt(0);            // 문자열을 문자(char)로 변환한다.
	      int num2 = Integer.parseInt(args[2]);

	      int result = 0;

	      switch(op) {    // switch문의 수식으로 char타입의 변수도 가능하다.               
	         case '+':
	            result = num1 + num2;
	            break;
	         case '-':
	            result = num1 - num2;
	            break;
	         case 'x':	
	            result = num1 * num2;
	            break;
	         case '/':
	            result = num1 / num2;
	            break;
	         default :
	            System.out.println("지원되지 않는 연산입니다.");
	      }

	      System.out.println("결과:"+result);
	}

}
