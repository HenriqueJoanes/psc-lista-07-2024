import java.util.Scanner;

public class InvestigacaoCriminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às seguintes perguntas sobre o crime:");
        System.out.print("Telefonou para a vítima? (S/N): ");
        char telefonou = scanner.next().charAt(0);

        System.out.print("Esteve no local do crime? (S/N): ");
        char esteveNoLocal = scanner.next().charAt(0);

        System.out.print("Mora perto da vítima? (S/N): ");
        char moraPerto = scanner.next().charAt(0);

        System.out.print("Devia para a vítima? (S/N): ");
        char devia = scanner.next().charAt(0);

        System.out.print("Já trabalhou com a vítima? (S/N): ");
        char trabalhouComVitima = scanner.next().charAt(0);

        int respostasPositivas = 0;
        if (telefonou == 'S') {
            respostasPositivas++;
        }
        if (esteveNoLocal == 'S') {
            respostasPositivas++;
        }
        if (moraPerto == 'S') {
            respostasPositivas++;
        }
        if (devia == 'S') {
            respostasPositivas++;
        }
        if (trabalhouComVitima == 'S') {
            respostasPositivas++;
        }

        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
