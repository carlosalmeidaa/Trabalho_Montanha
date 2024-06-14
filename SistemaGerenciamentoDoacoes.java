public class SistemaGerenciamentoDoacoes {

    public static void main(String[] args) {
        InterfaceDoUsuario interfaceDoUsuario = new InterfaceDoUsuario();
        BancoDeDados bancoDeDados = new BancoDeDados();

        int opcao;

        do {
            interfaceDoUsuario.exibirTelaEntrada();
            opcao = interfaceDoUsuario.obterOpcao();

            switch (opcao) {
                case 1:
                    Doacao doacao = interfaceDoUsuario.obterDoacao();
                    bancoDeDados.armazenarDoacao(doacao);
                    System.out.println("Doação registrada com sucesso!");
                    break;
                case 2:
                    int totalDoacoes = calcularTotalDoacoes(bancoDeDados);
                    interfaceDoUsuario.exibirTotalDoacoes(totalDoacoes);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static int calcularTotalDoacoes(BancoDeDados bancoDeDados) {
        int totalDoacoes = 0;

        for (Doacao doacao : bancoDeDados.recuperarDoacoes()) {
            totalDoacoes += doacao.getQuantidade();
        }

        return totalDoacoes;
    }
}
