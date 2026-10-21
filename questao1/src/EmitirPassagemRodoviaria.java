package prova2.questao1.src;

public class EmitirPassagemRodoviaria extends EmitirPassagem {

    public EmitirPassagemRodoviaria(String passageiro, double valorTarifa) {
        this.passageiro = passageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public Passagem criarPassagem() {
        return new PassagemRodoviaria(passageiro, valorTarifa);
    }

}
