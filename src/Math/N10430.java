package Math;

import java.util.Scanner;

public class N10430 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println((A+B)%C);
        System.out.println((A%C + B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C * B%C)%C);
    }
}
