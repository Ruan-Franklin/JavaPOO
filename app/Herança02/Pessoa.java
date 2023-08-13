public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    //Métodos especiais

    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    //Métodos
    public  final void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
        if(this.getSexo() == "M"){
            System.out.println("Feliz aniversário, "+this.getNome() + "Você é um rapaz muito especial" + "Aproveite seus " + this.getIdade() + " anos de vida");
        }
        else{
            System.out.println("Feliz aniversário, "+this.getNome() + "Você é uma moça muito especial" + "Aproveite seus " + this.getIdade() + " anos de vida");
        }
    }
    @Override
    public String toString(){
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';

    }
}

