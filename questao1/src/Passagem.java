package prova2.questao1.src;

import java.util.List;

public abstract class Passagem {
    protected String titular;
    protected double taxaEmbarque;
    protected double valorTarifa;
    protected List<String> documentosExigidos;

    public Passagem(String titular, double valorTarifa){
        this.titular = titular;
        this.valorTarifa = valorTarifa;
    }

    public abstract void listarDocumentos();
    public abstract void calcularTarifa();

    public void gerarResumo() {
        System.out.println("=== Resumo ===");
        System.out.println("Passagem: " + this.getClass().getSimpleName());
        System.out.println("Passageiro: " + titular);
        System.out.printf("Taxa Embarque Calculada: R$ %.2f\n", taxaEmbarque);
        System.out.println("Documentos Exigidos: " + String.join(", ", documentosExigidos));
        System.out.println("=========================\n");
    }
}
