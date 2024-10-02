import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int b = scanner.nextInt();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("최대공약수: " + a);
    }
}