import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        do {
            System.out.print("나이를 입력하세요 (0 이상의 값만 허용): ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("입력한 나이: " + age);
    }
}