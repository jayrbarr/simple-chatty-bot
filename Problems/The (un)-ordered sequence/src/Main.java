import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        boolean ascending = second != 0 && second > first;
        boolean orderDetermined = first != second;
        boolean ordered = true;

        while (second != 0) {
            if (!orderDetermined && first != second) {
                orderDetermined = true;
                ascending = second > first;
            }
            if (ascending && !(second >= first) || !ascending && !(second <= first)) {
                ordered = false;
                break;
            }
            first = second;
            second = sc.nextInt();
        }
        System.out.println(ordered);
    }
}