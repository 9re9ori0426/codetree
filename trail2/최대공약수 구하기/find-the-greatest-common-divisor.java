import java.util.Scanner;

public class Main {
    public static void nm(int n, int m) {
        int num = 0;
        for(int i = 100; i > 0; i--) {
            if(n % i == 0 && m % i == 0) {
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        nm(n, m);
    }
}