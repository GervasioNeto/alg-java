import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de números no array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Digite os " + n + " números do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        QuickSort.sort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        for (int item : array) {
            System.out.print(item + " ");
        }

        scanner.close();
    }
}
