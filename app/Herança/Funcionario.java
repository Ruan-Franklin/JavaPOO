public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    //Métodos especiais
    public boolean isTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    //Métodos
    public void mudarTrabalho(){
        if(this.isTrabalhando()){
            this.setTrabalhando(false);
            System.out.println("O funcionário " + this.getNome() + " parou de trabalhar!");
        }
        else{
            this.setTrabalhando(true);
            System.out.println("O funcionário " + this.getNome() + " começou a trabalhar!");
        }
    }
}