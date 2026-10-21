package prova2.questao1.src;

import java.util.List;

public class PassagemAerea extends Passagem {
    public PassagemAerea(String titular, double valorTarifa){
        super(titular, valorTarifa);
    }

    @Override
    public void listarDocumentos(){
        this.documentosExigidos = List.of("documento de identidade com foto", "e-ticket");
    }
    
    @Override
    public void calcularTarifa(){
        this.taxaEmbarque = this.valorTarifa * 0.08;
    }

}
