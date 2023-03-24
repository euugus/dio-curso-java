import java.util.Scanner;

public class SomaTermos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = 0.0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            h += 1.0/i;
        }

        System.out.printf("%.0f\n", h);

    }
}
