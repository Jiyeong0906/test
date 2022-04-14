import java.util.Scanner;

public class Practice04 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (((a <= b) && (b <= c)) || ((c <= b) && (b <= a))) System.out.println("중간 값은 " + b);
        else if (((b <= c) && (c <= a)) || ((a <= c) && (c <=  b))) System.out.println("중간 값은 " + c);
        else if (((c <= a) && (a <= b)) || ((b <= a) && (a <= c))) System.out.println("중간 값은 " + a);

        scanner.close();
    }
}