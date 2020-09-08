import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int checkPositive = sc.nextInt();
        System.out.println(checkPositive > 0 ? "YES" : "NO");
    }
}