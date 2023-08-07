public class Pessoa{
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Método público
    public void fazerAniversario(){
        this.setIdade(this.getIdade() +1);
        System.out.println("Parabéns pelos seus " + this.getIdade() + " anos, "+ this.getNome() + "!");
    }

    //Métodos especiais

    //Construtor
    public Pessoa(String n, int i, String s){
        this.setNome(n);
        this.setIdade(i);
        this.setSexo(s);
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
}