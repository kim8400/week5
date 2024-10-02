import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            num = scanner.nextInt();
        } while (num < 1);

        System.out.println("입력한 값: " + num);
    }
}