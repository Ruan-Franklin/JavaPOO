public  class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;

    //Métodos especiais
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String c){
        this.curso =c;
    }
    //Métodos
    public  void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + " do curso  "+this.getCurso());
    }
    
}
