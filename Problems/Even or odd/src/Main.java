import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
            n = sc.nextInt();
        }
    }
}