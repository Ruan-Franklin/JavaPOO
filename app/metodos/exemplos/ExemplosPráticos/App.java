import JavaPOO.JavaPOO.app.metodos.exemplos.ExemplosPráticos.ContaBanco;

public class App{
    public static void main(String [] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Braulio");
        p1.abrirConta("CC");
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.estadoAtual();
    }
}