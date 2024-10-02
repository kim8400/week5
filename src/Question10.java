import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        while (true) {
            System.out.print("숫자 n을 입력하세요: ");
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            System.out.println("1부터 " + n + "까지의 합: " + sum);

            if (n >= 100) {
                System.out.println("n이 100 이상이므로 프로그램을 종료합니다.");
                break;
            }
            sum = 0;
        }
    }
}