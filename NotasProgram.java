import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotasProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota;
        while (true) {
            nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        int numNotas = notas.size();
        System.out.println("Quantidade de valores lidos: " + numNotas);

        System.out.print("Valores informados (na ordem): ");
        for (double n : notas) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Valores informados (na ordem inversa):");
        for (int i = numNotas - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / numNotas;
        System.out.println("Média dos valores: " + media);

        int acimaMedia = 0;
        int abaixoSete = 0;
        for (double n : notas) {
            if (n > media) {
                acimaMedia++;
            }
            if (n < 7) {
                abaixoSete++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);

        System.out.println("Programa encerrado. Obrigado!");
        scanner.close();
    }
}
