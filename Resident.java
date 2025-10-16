import java.util.Scanner;

public class Resident {
    // 확장 개선 프로그램
    // 1,3으로 시작되면 남자
    // 2,4으로 시작되면 여자
    // 5,6이면 외국인
    // 0,7,8,9로 시작하는 주민번호를 입력하면 "다시 입력하세요"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("13자리의 숫자를 입력하세요");    
    String rrn = scanner.next();
    char genderCode = rrn.charAt(7);

    
    if(genderCode == '2'){System.out.println("여자");}
    else if (genderCode == '4'){System.out.println("여자");}
    else if (genderCode =='3'){System.out.println("남자");}
    else if (genderCode == '1'){System.out.println("남자");}
    else if(genderCode == '5'){System.out.println("외국인");}
    else if (genderCode =='6'){System.out.println("외국인");}
else{System.out.println("잘못된 주민번호입니다. 다시 입력해주세요");}

    




}
    
}
