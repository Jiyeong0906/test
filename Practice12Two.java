import java.util.Scanner;

public class Practice12Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();

        switch (operator) {
            case "+":
            System.out.printf("%.2f + %.2f의 계산 결과는 %.2f\n", a, b, a+b);
            break;
            case "-":
            System.out.printf("%.2f - %.2f의 계산 결과는 %.2f\n", a, b, a-b);
            break;
            case "*":
            System.out.printf("%.2f * %.2f의 계산 결과는 %.2f\n", a, b, a*b);
            break;
            case "/":
            if (b == 0) System.out.println("0으로 나눌 수 없습니다.");
            else System.out.printf("%.2f / %.2f의 계산 결과는 %.2f\n", a, b, a/b);
            break;
        }
        scanner.close();
    }
}
