import java.util.ArrayList;

public class BancoDeDados {

    private static ArrayList<Doacao> doacoes = new ArrayList<>();

    public static void armazenarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public static ArrayList<Doacao> recuperarDoacoes() {
        return doacoes;
    }
}
