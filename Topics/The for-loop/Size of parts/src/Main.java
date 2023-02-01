import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Please enter in number" +
                //" of parts:");
        int results = scanner.nextInt();
        int smaller = 0;
        int perfect = 0;
        int larger = 0;

        for (int i = 0; i < results; i++) {
            int part = scanner.nextInt();
            if (part == -1) {
                smaller++;
            }
            else if (part == 0) {
                perfect++;
            }
            else {
                larger++;
            }
        }

        System.out.println(perfect + " " + larger +
                " " + smaller);
    }
}
