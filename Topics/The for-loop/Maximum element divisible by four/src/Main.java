import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int high = 0;

        for (int i = 0; i < total; i++) {
           int num = scanner.nextInt();

           if (num % 4 == 0 && num > high) {
               high = num;
           }
        }

        System.out.println(high);
    }
}