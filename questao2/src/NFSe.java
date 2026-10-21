package prova2.questao2.src;

public class NFSe implements DocumentoFiscal {
    private double valorCurso;

    public NFSe(double valorCurso) {
        this.valorCurso = valorCurso;
    }

    @Override
    public String descricao() {
        return String.format("NFS-e com ISS de 5%%: R$ %.2f", valorCurso * 0.05);
    }
}
