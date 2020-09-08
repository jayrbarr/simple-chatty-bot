import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int n = sc.nextInt();
        while (n != 0) {
            total += n;
            if (total >= 1000) {
                total -= 1000;
                break;
            }
            n = sc.nextInt();
        }
        System.out.println(total);
    }
}