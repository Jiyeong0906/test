import java.util.Scanner;

public class Practice08 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
        return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 점(x1, y1)의 좌표 입력>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("두번째 점(x2, y2)의 좌표 입력>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (inRect(x1, y1, 100, 100, 200, 200)) {
            if (inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("두 직사각형은 충돌하지 않습니다.");
            else System.out.println("두 직사각형은 충돌합니다.");
        }
        else if (inRect(x2, y2, 100, 100, 200, 200)) {
            if (inRect(x1, y1, 100, 100, 200, 200))
            System.out.println("두 직사각형은 충돌하지 않습니다");
            else System.out.println("두 직사각형은 충돌합니다.");
        }
        else if (inRect(x1, y2, 100, 100, 200, 200) || (inRect(x2, y1, 100, 100, 200, 200)))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x1 < 100 && x2 > 200 && y1 < 100 && y2 > 100 && y2 < 200) || (x1 < 100 && x2 > 200 && y1 > 100 && y1 < 200 && y2 < 100))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x2 < 100 && x1 > 200 && y1 < 100 && y2 > 100 && y2 < 200) || (x2 < 100 && x1 > 200 && y1 > 100 && y1 < 200 && y2 < 100))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x1 < 100 && x2 > 200 && y1 > 200 && y2 > 100 && y2 < 200) || (x1 < 100 && x2 > 200 && y2 > 200 && y1 > 100 && y1 < 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x2 < 100 && x1 > 200 && y1 > 200 && y2 > 100 && y2 < 200) || (x2 < 100 && x1 > 200 && y2 > 200 && y1 > 100 && y1 < 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x1 < 100 && x2 > 100 && x2 < 200 && y1 < 100 && y2 > 200) || (x1 < 100 && x2 > 100 && x2 < 200 && y2 < 100 && y1 > 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x2 < 100 && x1 > 100 && x1 < 200 && y1 < 100 && y2 > 200) || (x2 < 100 && x1 > 100 && x1 < 200 && y2 < 100 && y1 > 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x1 > 100 && x1 < 200 && x2 > 200 && y1 < 100 && y2 > 200) || (x1 > 100 && x1 < 200 && x2 > 200 && y2 < 100 && y1 > 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else if ((x2 > 100 && x2 < 200 && x1 > 200 && y1 < 100 && y2 > 200) || (x2 > 100 && x2 < 200 && x1 > 200 && y2 < 100 && y1 > 200))
        System.out.println("두 직사각형은 충돌합니다.");
        else
        System.out.println("두 직사각형은 충돌하지 않습니다.");

        scanner.close();
    }
}