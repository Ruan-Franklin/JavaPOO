public class Peixe extends Animal{
    //Atributos
    protected String corEscama;
    
    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String cep){
        this.corEscama = cep;
    }
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    @Override
    public String toString() {
        return "Peixe{" + "corEscama=" + corEscama + '}';
    }
}
