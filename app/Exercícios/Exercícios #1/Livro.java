public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos públicos
    @Override
    public void abrir() {
        //Método para abrir um livro
        if(this.getAberto() == false){
            this.setAberto(true);
            System.out.println("Livro aberto!");
        }
        else{
            System.out.println("Livro já está aberto!");
        }
    }

    @Override
    public void fechar() {
        //Método para fechar um livro
        if(this.getAberto()){
            this.setAberto(false);
            System.out.println("Livro fechado!");
        }
        else{
            System.out.println("Livro já está fechado!");
        }
    }

    @Override
    public void folhear(int p) {
       //Método para folhear um livro
         if(this.getAberto()){
              if(p > this.getTotPaginas()){
                System.out.println("Página inexistente!");
              }
              else{
                this.setPagAtual(p);
                System.out.println("Folheando...");
              }
         }
         else{
              System.out.println("Livro fechado!");
         }
    }

    @Override
    public void avancarPag() {
        //Método para avançar uma página
        if(this.getAberto()){
            if(this.getPagAtual() == this.getTotPaginas()){
                System.out.println("Não é possível avançar mais páginas!");
            }
            else{
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Página avançada com sucesso! Estamos na página " + this.getPagAtual());
            }
        }
    }

    @Override
    public void voltarPag() {
        //Método para voltar uma página
        if(this.getAberto()){
            if(this.getPagAtual() == this.getTotPaginas()){
                System.out.println("Não é possível avançar mais páginas!");
            }
            else{
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Página avançada com sucesso! Estamos na página " + this.getPagAtual());
            }
        }
    }

    public String detalhes(){
        //Detalhes do livro
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade() + ", sexo=" + leitor.getSexo() + '}';
    }

    //Métodos especiais
    //Construtor
    public Livro(String t, String a, int tp, Pessoa l){
        this.setTitulo(t);
        this.setAutor(a);
        this.setTotPaginas(tp);
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(l);
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String t){
        this.titulo = t;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String a){
        this.autor = a;
    }
    public int getTotPaginas(){
        return this.totPaginas;
    }
    public void setTotPaginas(int tp){
        this.totPaginas = tp;
    }
    public int getPagAtual(){
        return this.pagAtual;
    }
    public void setPagAtual(int pa){
        this.pagAtual = pa;
    }
    public boolean getAberto(){
        return this.aberto;
    }
    public void setAberto(boolean a){
        this.aberto = a;
    }
    public Pessoa getLeitor(){
        return this.leitor;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }


    
}

