import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        
        System.out.println("너의 이름은 ?");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name);
    }
}
