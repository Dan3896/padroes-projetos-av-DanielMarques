package prova2.questao1.src;

public class Main {
    public static void main(String[] args) {
        EmitirPassagem emissorAereo = new EmitirPassagemAerea("daniel", 2000.00);   
        EmitirPassagem emissorFerroviario = new EmitirPassagemFerroviaria("daniel", 200.00);   
        EmitirPassagem emissorRodoviario = new EmitirPassagemRodoviaria("daniel", 150.00);

        emissorAereo.processarPassagem();
        emissorFerroviario.processarPassagem();
        emissorRodoviario.processarPassagem();
    }
}
