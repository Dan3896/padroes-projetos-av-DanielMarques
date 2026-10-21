package prova2.questao2.src;

public class ComprovanteRUT implements Comprovante {
    private String rut;

    public ComprovanteRUT(String rut) {
        this.rut = rut;
    }

    @Override
    public String descricao() {
        return "Comprovante de matrícula para o RUT: " + rut;
    }
}
