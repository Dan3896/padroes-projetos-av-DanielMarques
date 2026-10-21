package prova2.questao1.src;

import java.util.List;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String titular, double valorTarifa){
        super(titular, valorTarifa);
    }

    @Override
    public void listarDocumentos(){
        this.documentosExigidos = List.of("documento de identidade com foto", "comprovante de reserva");
    }
    
    @Override
    public void calcularTarifa(){
        this.taxaEmbarque = this.valorTarifa * 0.05;
    }

}
