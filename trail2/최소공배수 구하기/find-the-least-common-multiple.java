import java.util.Scanner;

public class Main {
    public static void nm(int n, int m) {
        int num = 0;
        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(n * i == m * j) {
                    num = n * i;
                    break;
                }
            }
            if(num != 0) {
                break;
            }
        }
        System.out.print(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        nm(n, m);
    }
}