public class Doacao {

    private String tipoDoacao;
    private int quantidade;
    private String dataDoacao;

    public Doacao(String tipoDoacao, int quantidade, String dataDoacao) {
        this.tipoDoacao = tipoDoacao;
        this.quantidade = quantidade;
        this.dataDoacao = dataDoacao;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }
}
