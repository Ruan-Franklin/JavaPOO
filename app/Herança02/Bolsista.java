public class Bolsista extends Aluno{
    // Atributos
    private float bolsa;
    // Métodos especiais
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    // Métodos
    public void renovarBolsa(){
        System.out.println("A bolsa do aluno " +this.getNome() + " foi renovada com sucesso!");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
}