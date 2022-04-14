import java.util.Scanner;

public class Practice12One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double a = scanner.nextDouble();
        String operator = scanner.next();
        double b = scanner.nextDouble();

        if (operator.equals("+"))
        System.out.printf("%.2f + %.2f의 계산 결과는 %.2f\n", a, b, a+b);
        else if (operator.equals("-"))
        System.out.printf("%.2f - %.2f의 계산 결과는 %.2f\n", a, b, a-b);
        else if (operator.equals("*"))
        System.out.printf("%.2f * %.2f의 계산 결과는 %.2f\n", a, b, a*b);
        else if (operator.equals("/")) {
            if (b == 0) System.out.println("0으로 나눌 수 없습니다.");
            else System.out.printf("%.2f / %.2f의 계산 결과는 %.2f\n", a, b, a/b);
        }
        scanner.close();
    }
}