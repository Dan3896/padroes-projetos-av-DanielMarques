package prova2.questao2.src;

public interface FabricaMatricula {
    DocumentoFiscal criarDocumentoFiscal(double valorCurso);
    Pagamento criarPagamento(double valorCurso);
    Comprovante criarComprovante();
}
