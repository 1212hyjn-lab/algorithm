import java.util.Scanner;

public class Grade {
    // 확장 개선 프로그램
    // 90 - 100 A
    // 80 - 89 B
    // 70 - 79 C
    // 60 - 69 D
    // 이하는 F
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0부터 100까지 점수를 입력받습니다");
   
        int Score = scanner.nextInt();
        if(Score >= 90){System.out.println("학점 A");
        }else if (Score >= 80) {System.out.println("학점 B");
        }else if (Score >= 70) {System.out.println("학점 C");
        }else if (Score >= 60){System.out.println("학점 D");
    }else if (Score >=0) {System.out.println("학점 F");
        
    }else{System.out.println("잘못된 점수입니다");}
        
        
                }
}
