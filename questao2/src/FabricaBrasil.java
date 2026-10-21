package prova2.questao2.src;

public class FabricaBrasil implements FabricaMatricula {
    private String cpf;

    public FabricaBrasil(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valorCurso) {
        return new NFSe(valorCurso);
    }

    @Override
    public Pagamento criarPagamento(double valorCurso) {
        return new PagamentoPix(valorCurso);
    }

    @Override
    public Comprovante criarComprovante() {
        return new ComprovanteCPF(cpf);
    }
}
