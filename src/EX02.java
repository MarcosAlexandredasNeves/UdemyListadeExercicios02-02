import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
