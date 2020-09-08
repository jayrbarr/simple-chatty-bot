import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long total = 1;
        int n = 1;
        while (total <= m) {
            n++;
            total *= n;
        }
        System.out.println(n);
    }
}