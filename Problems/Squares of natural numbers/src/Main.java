import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (count * count <= n) {
            System.out.println(count * count);
            count++;
        }
    }
}