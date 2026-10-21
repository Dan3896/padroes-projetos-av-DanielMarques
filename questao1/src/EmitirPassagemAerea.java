package prova2.questao1.src;

public class EmitirPassagemAerea extends EmitirPassagem {

    public EmitirPassagemAerea(String passageiro, double valorTarifa) {
        this.passageiro = passageiro;
        this.valorTarifa = valorTarifa;
    }

    @Override
    public Passagem criarPassagem() {
        return new PassagemAerea(passageiro, valorTarifa);
    }

}
