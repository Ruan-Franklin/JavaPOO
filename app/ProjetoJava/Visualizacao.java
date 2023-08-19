public class Visualizacao {

    //Atributos
    private Gafanhoto espectador;
    private Video filme;
    //Construtor
    public  Visualizacao(Gafanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    //Avaliar com sobrecarga
    public void avaliar(String nota){
        if(nota.equals("Gostei muito")){
            this.filme.setAvaliacao(5);
        }
        else if(nota.equals("Gostei")){
            this.filme.setAvaliacao(4);}
        else{
            this.filme.setAvaliacao(0);
        }
    }
    //Avaliar com sobrecarga int
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    //Avaliar com sobrecarga float
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }
        else if(porc <= 50){
            tot = 5;
        }
        else if(porc <= 90){
            tot = 8;
        }
        else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    @Override
    public String toString(){
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}
    