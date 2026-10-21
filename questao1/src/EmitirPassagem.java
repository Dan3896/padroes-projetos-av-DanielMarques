package prova2.questao1.src;

public abstract class EmitirPassagem {
    protected String passageiro; 
    protected double valorTarifa; 
    
    public abstract Passagem criarPassagem();

    public final void processarPassagem() {
        Passagem passagem = criarPassagem();
        
        try {
            passagem.calcularTarifa();
            passagem.listarDocumentos();
            passagem.gerarResumo();
        } catch (Exception e) {
            System.out.println("Falha na emissão da passagem: " + e.getMessage());
        }
    }
}
