public class Pessoa{
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
        if(this.getSexo().equals("M")){
            System.out.println("Parabéns, " + this.getNome() + " você fez " + this.getIdade() + " anos, você é um rapaz especial!");
        }else{
            System.out.println("Parabéns, " + this.getNome() + " você fez " + this.getIdade() + " anos, você é uma moça especial!");
        }
    }


    //Métodos especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
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

    @Override
    public String toString()
    {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }

}