package prova2.questao2.src;

public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaBrasil("12345678911"), 2000.00);
        Matricula matriculaChile = new Matricula(new FabricaChile("12345678-9"), 2000.00);

        matriculaBrasil.confirmar();
        matriculaChile.confirmar();
    }
}
