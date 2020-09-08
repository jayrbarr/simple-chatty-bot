import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i) == 'a' ? 'b' : str.charAt(i);
            System.out.print(ch);
        }
    }
}