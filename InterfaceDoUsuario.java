import java.util.Scanner;

public class InterfaceDoUsuario {

    private static Scanner scanner = new Scanner(System.in);

    public static void exibirTelaEntrada() {
        System.out.println("----- Sistema de Gerenciamento de Doações -----");
        System.out.println("1 - Registrar doação");
        System.out.println("2 - Calcular total de doações");
        System.out.println("3 - Sair");
        System.out.print("Opção: ");
    }

    public static int obterOpcao() {
        return scanner.nextInt();
    }

    public static Doacao obterDoacao() {
        System.out.print("Tipo de doação: ");
        String tipoDoacao = scanner.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Data da doação (dd/mm/aaaa): ");
        String dataDoacao = scanner.nextLine();

        return new Doacao(tipoDoacao, quantidade, dataDoacao);
    }

    public static void exibirTotalDoacoes(int totalDoacoes) {
        System.out.println("Total de doações: " + totalDoacoes);
    }
}
