package JavaPOO.JavaPOO.app.metodos.exemplos.ExemplosPráticos;
public class ContaBanco{
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos personalizados

    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);
        }
        else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, não é possível fechar!");
        }
        else if(this.getSaldo() < 0 ){
            System.out.println("Conta em débito, não é possível fechar!");
        }
        else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v ){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Dinheiro dpositado com sucsso!");
        }
        else{
            System.out.println("Não foi possível depositar");
         }

    }

    public void sacar(float v){
        if(v > this.getSaldo()){
            System.out.println("Você não tem saldo suficiente para sacar esse valor!");
        }
        else if(v < 0){
            System.out.println("Não é possível sacar um valor negativo!");
        }

        else if(this.status == false){
            System.out.println("Não é possível sacar de uma conta fechada!");
        }
        else{
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta por " + this.getDono());
        }

    }
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }
        else if(this.getTipo() == "CP"){
            v = 20;
        }
        else if(this.getStatus() == false){
            System.out.println("Não é possível pagar uma conta fechada!");
        }
        System.out.println("Mensalidade paga com sucesso por " + this.getDono());
    }


    // Métodos especiais

    public  ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }



}





