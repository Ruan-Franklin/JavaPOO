public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    //Métodos especiais
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    @Override
    public void play() {
        if(this.isReproduzindo() == false){
            this.setReproduzindo(true);
            System.out.println("-----------------------");
            System.out.println("Vídeo em reprodução");
            System.out.println("-----------------------");
        }else{
            System.out.println("O vídeo já está sendo reproduzido!");
        }
    }

    @Override
    public void pause() {
        if(this.isReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("-----------------------");
            System.out.println("Vídeo pausado");
            System.out.println("-----------------------");
    }else{
        System.out.println("O vídeo já está pausado!");
    }
}

    @Override
    public void like() {
        this.curtidas++;
        System.out.println("-----------------------");
        System.out.println("Você deixou o seu gostinha, ative o sininho também");
        System.out.println("-----------------------");
    }
    @Override
    public String toString(){
      return "Video: " + this.getTitulo() + " views: " + this.getViews() + " curtidas: " + this.getCurtidas() + " Avaliação: " +this.getAvaliacao() + " Reproduzindo? " + this.isReproduzindo();
    }
    
    
    
}
