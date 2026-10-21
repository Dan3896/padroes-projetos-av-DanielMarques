package prova2.questao2.src;

public class FabricaChile implements FabricaMatricula {
    private String rut;

    public FabricaChile(String rut) {
        this.rut = rut;
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valorCurso) {
        return new BoletaElectronica(valorCurso);
    }

    @Override
    public Pagamento criarPagamento(double valorCurso) {
        return new PagamentoWebpay(valorCurso);
    }

    @Override
    public Comprovante criarComprovante() {
        return new ComprovanteRUT(rut);
    }
}
