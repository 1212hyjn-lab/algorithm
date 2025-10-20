import java.util.Scanner;

public class Jumin {
    // 확장 개선 프로그램
    // 1,3으로 시작되면 남자
    // 2,4으로 시작되면 여자
    // 5,6이면 외국인
    // 0,7,8,9로 시작하는 주민번호를 입력하면 "다시 입력하세요"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("주민번호를 입력해 주세요");    
    String jumin = scanner.nextLine();
    char a = jumin.charAt(7);
    
    if( a == '1'){System.out.println("남성");}
    else if( a == '3'){System.out.println("남성");}
    else if( a == '2'){System.out.println("여성");}
    else if( a == '4'){System.out.println("여성");}
    else if( a == '5'){System.out.println("외국인");}
    else if( a == '6'){System.out.println("외국인");}
    else {System.out.println("잘못된 주민번호입니다. 다시 입력해주세요.");}
        


    




}
    
}
