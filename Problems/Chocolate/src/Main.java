import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(); // width of the chocolate bar
        int l = sc.nextInt(); // length of the chocolate bar
        int k = sc.nextInt(); // how many sections we want to break off in on straight line

        if (k % w == 0 && k / w < l || k % l == 0 && k / l < w) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}