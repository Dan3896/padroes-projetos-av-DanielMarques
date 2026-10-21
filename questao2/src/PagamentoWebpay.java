package prova2.questao2.src;

public class PagamentoWebpay implements Pagamento {
    private double valor;

    public PagamentoWebpay(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format("Pagamento via Webpay: CLP %.2f", valor);
    }
}
