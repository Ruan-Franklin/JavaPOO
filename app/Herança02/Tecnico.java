public class Tecnico extends Aluno {
    private int registroProfissional;
    //Métodos especiais
    public int getRegistroProfissional(){
        return this.registroProfissional;
    }
    public void setRegistroProfissional(int r){
        this.registroProfissional = r;
    }
    //Métodos
    public void praticar(){
        System.out.println("O técnico " + this.getNome() + " está praticando!");
    }
    
}
