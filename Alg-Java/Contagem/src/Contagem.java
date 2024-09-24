import java.util.List;

public class Contagem {
    public static int contarNumerosInteiros(List<Double> numeros) {
        int count = 0;
        for (double numero : numeros) {
            if (numero == (int) numero) {
                count++;
            }
        }
        return count;
    }
}

