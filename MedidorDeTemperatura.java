import java.util.Scanner;

public class MedidorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        int contador = 0;
        double soma = 0;

        while (contador < 12) {
            System.out.println("Insira a temperatura " + (contador + 1) + " (deve ser entre 4°C e 10°C): ");
            double temp = scanner.nextDouble();
            
            if (temp >= 4 && temp <= 10) {
                temperaturas[contador] = temp;
                soma += temp;
                contador++;
            } else {
                System.out.println("Temperatura inválida. Por favor, insira uma temperatura dentro do intervalo permitido.");
            }
        }
        
        double media = soma / 12;
        System.out.printf("A média das temperaturas válidas é: %.2f°C\n", media);
    }
}
