import java.util.Random;
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos Especiais

    public Lutador getDesafiado(){
        return this.desafiado;
    }
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public Lutador getDesafiante(){
        return this.desafiante;
    }
    public void setDesafiante(Lutador de){
        this.desafiante = de;
    }
    public int getRounds(){
        return this.rounds;
    }
    public void setRounds(int r){
        this.rounds = r;
    }
    public boolean getAprovada(){
        return this.aprovada;
    }
    public void setAprovada(boolean a){
        this.aprovada = a;
    }
    //Métodos gerais
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("Luta marcada");
        }else{
            System.out.println("Luta não pode acontecer");
        }

    }
    public void Lutar(){
        if(this.getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            //Random aleatório. de 1 a 3
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1: //Desafiado vencedor
                    System.out.println("Vitória de " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: //Desafiante vencedor
                    System.out.println("Vitória de " + this.getDesafiante().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                
            }

    }
}
}
