public class Ave extends Animal{
    //Atributos
    protected String corPena;
    //Métodos especiais
    public String getCorPena(){
        return this.corPena;
    }
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    @Override
    public void locomover(){
        System.out.println("Voando...");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    public void fazerNinho(){
        System.out.println("Construiu ninho...");
    }
    @Override
    public String toString(){
        return "Ave{ " + "peso= " +this.getPeso() + "Idade: " +this.getIdade() + "Membros: " +this.getMembros() + "Cor da pena: " +this.getCorPena() + "}";

    
}
}