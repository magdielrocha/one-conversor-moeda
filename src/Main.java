import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner opcaoEscolhida = new Scanner(System.in);

        ConsultaMoedas consulta = new ConsultaMoedas();
        Moedas dados = consulta.retornaMoeda();

        int opcao = -1;

        System.out.println("*******************************************");
        System.out.println("Seja bem vindo(a) ao Conversor de Moeda =]");

        do {
            String menu = """
                   
                   Escolha uma opção de conversão:
                   
                   1) Dólar =>> Peso argentino
                   2) Peso argetino ==> Dólar
                   3) Dólar ==> Real brasileiro
                   4) Real brasileiro ==> Dólar
                   5) Dólar ==> Peso colombiano
                   6) Peso colombiano =>> Dólar
                   7) Sair
                   
                   """;
            System.out.println(menu);
            System.out.println("Digite uma opção entre 1 e 7: ");

            if (opcaoEscolhida.hasNextInt()) {
                opcao = opcaoEscolhida.nextInt();

                if(opcao >= 1 && opcao <= 6){
                    System.out.println("Digite o valor a ser convertido: ");
                    double valor = opcaoEscolhida.nextDouble();

                    double resultado = switch (opcao) {
                        case 1 -> valor * dados.conversion_rates().get("ARS"); // Dólar para Peso argentino
                        case 2 -> valor / dados.conversion_rates().get("ARS"); // Peso argentino para Dólar
                        case 3 -> valor * dados.conversion_rates().get("BRL"); // Dólar para Real
                        case 4 -> valor / dados.conversion_rates().get("BRL"); // Real para Dólar
                        case 5 -> valor * dados.conversion_rates().get("COP"); // Dólar para Peso colombiano
                        case 6 -> valor / dados.conversion_rates().get("COP"); // Peso colombiano para Dólar
                        default -> 0;
                    };

                    System.out.printf("Resultado da conversão: %.2f\n", resultado);
                } else if (opcao == 7) {
                    System.out.println("Saindo do programa...");
                } else {
                    System.out.println("Opção inválida. Digite novamente: ");
                    opcaoEscolhida.nextLine();
                    opcao = -1;
                }
            }
        } while (opcao != 7);

        opcaoEscolhida.close();
    }
}
