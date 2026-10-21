package prova2.questao2.src;

public class Matricula {
    private FabricaMatricula fabrica;
    private double valorCurso;

    public Matricula(FabricaMatricula fabrica, double valorCurso) {
        this.fabrica = fabrica;
        this.valorCurso = valorCurso;
    }

    public void confirmar() {
        DocumentoFiscal documento = fabrica.criarDocumentoFiscal(valorCurso);
        Pagamento pagamento = fabrica.criarPagamento(valorCurso);
        Comprovante comprovante = fabrica.criarComprovante();

        System.out.println("=== Relatório da Matrícula ===");
        System.out.println(documento.descricao());
        System.out.println(pagamento.descricao());
        System.out.println(comprovante.descricao());
        System.out.println("==============================\n");
    }
}
