import JavaPOO.app.Encapsulamento.Exemplos.Controlador;

public class ControleRemoto implements Controlador{

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean desligado;
    private boolean tocando;

    //Métodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(Boolean l){
        ligado = l;
    }

    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(Boolean t){
        this.tocando = t;
    }
    //Métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Está ligado? " + this.getLigado());
        for(int i = 0 ; i<= this.getVolume(); i+=10){
            System.out.println("Volume: " + i);
        }
        System.out.println("Está tocando? " + this.getTocando());
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }
    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() +1);
    }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() -5);
    }
}
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
    }
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
    }
}
    @Override
    public void play() {
        if(this.getLigado()){
            this.setTocando(true);
    }
}
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
        this.setTocando(false);
        }
    }
    

    
}
