import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (C < A) System.out.println("Deficiency");
        else if (C > B) System.out.println("Excess");
        else System.out.println("Normal");
    }
}