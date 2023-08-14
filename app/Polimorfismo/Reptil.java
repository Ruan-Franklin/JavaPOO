public class Reptil extends Animal {
    //Atributos
    protected String corEscama;
    //Métodos especiais
    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String ce){
        this.corEscama = ce;
    }
    @Override
    public void locomover(){
        System.out.println("Rastejando...");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo vegetais!!!");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de réptil!!!");

    }
    @Override
    public String toString(){
        return "Réptil{" + "peso=" + this.getPeso() + ", idade=" + this.getIdade() + ", membros=" + this.getMembros() + ", corEscama=" + this.getCorEscama() + '}';
    }
    
}
