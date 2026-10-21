package prova2.questao2.src;

public class PagamentoPix implements Pagamento {
    private double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format("Pagamento via Pix: R$ %.2f", valor);
    }
}
