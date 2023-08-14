public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    //Métodos especiais
    public String getCorPelo(){
        return this.corPelo;
    }
    public void setCorPelo(String c){
        this.corPelo = c;
    }
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero!");
    }
    
    @Override
    public String toString(){
        return "Mamífero: : " + "\nPeso: " + this.getPeso() + "\nIdade: " + this.getIdade() + "\nMembros: " + this.getMembros() + "\nCor do pelo: " + this.getCorPelo();
    }
}
