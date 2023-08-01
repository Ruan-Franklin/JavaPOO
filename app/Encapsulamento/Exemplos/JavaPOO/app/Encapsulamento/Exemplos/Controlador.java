package JavaPOO.app.Encapsulamento.Exemplos;

public interface Controlador {
    //o void indica que o método não retorna nada
    //abstract deixa claro que o método é abstrato
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
    
}
