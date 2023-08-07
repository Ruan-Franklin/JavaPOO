public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    //Métodos
    public void receberAumento(float a){
        this.setSalario(this.getSalario() + a);
        System.out.println("O salário de "+ getNome() + " foi aumentado para: R$ "+ this.getSalario());
    }

    //Métodos especiais
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
}    
    

