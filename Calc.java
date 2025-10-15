import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    System.out.println("계산기");
    System.out.println("첫번째 숫자 입력");
 Scanner scanner = new Scanner(System.in);
 int num1 = scanner.nextInt();
  System.out.println("연산자 입력 + - x /");
 String opcode = scanner.next();
System.out.println(opcode);
System.out.println("두번째 숫자 입력");
int num2 = scanner.nextInt();
int result = 0;

    if (opcode.equals("+")) {
        result = num1 + num2;
}else if (opcode.equals("-")) {
    result = num1 - num2;
}else if (opcode.equals("*")) {
    result = num1 * num2;
}else if (opcode.equals("/")) {
    if (num2 != 0) {
        result = num1 / num2;
    } else {
        System.out.println("0으로 나눌 수 없습니다");
        scanner.close();
        return;
    }
}

 System.out.println("결과 :" + result);
 }
}
