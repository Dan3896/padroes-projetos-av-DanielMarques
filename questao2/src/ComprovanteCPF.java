package prova2.questao2.src;

public class ComprovanteCPF implements Comprovante {
    private String cpf;

    public ComprovanteCPF(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String descricao() {
        return "Comprovante de matrícula para o CPF: " + cpf;
    }
}
