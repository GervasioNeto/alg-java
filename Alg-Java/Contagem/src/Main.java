import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de itens: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Double> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }

        int count = Contagem.contarNumerosInteiros(numeros);

        System.out.println("Foram digitados " + count + " números inteiros.");

        scanner.close();
    }
}
