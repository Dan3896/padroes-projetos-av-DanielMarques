package prova2.questao1.src;

public class EmitirPassagemFerroviaria extends EmitirPassagem {

    public EmitirPassagemFerroviaria(String passageiro, double valorTarifa) {
        this.passageiro = passageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public Passagem criarPassagem() {
        return new PassagemFerroviaria(passageiro, valorTarifa);
    }

}
