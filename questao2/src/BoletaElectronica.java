package prova2.questao2.src;

public class BoletaElectronica implements DocumentoFiscal {
    private double valorCurso;

    public BoletaElectronica(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    @Override
    public String descricao() {
        return String.format("Boleta electrónica com IVA de 19%%: CLP %.2f", valorCurso * 0.19);
    }
}
