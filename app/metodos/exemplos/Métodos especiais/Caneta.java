public class Caneta{
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public  Caneta(String m, String c, float p){ // Método construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar();

    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;
    }
    
    public void destampar(){
        this.tampada = false;
    }

    public void tampar(){
        this.tampada=true;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: " + this.getCor());
        System.out.println("Ela está tampada? " + this.tampada);

    }
    


}