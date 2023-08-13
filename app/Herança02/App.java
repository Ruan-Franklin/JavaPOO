public class App{
    public static void main(String[] args){
        System.out.println("Hello World");
        Visitante v1 = new Visitante();
        //v1.setNome("Silvia");
        //v1.setIdade(21);
       // v1.setSexo("F");
        //System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Alcides");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("TADS");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setNome("Cbam");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setCurso("Redes");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        Professor p1 = new Professor();
        p1.setNome("Alessandro");
        p1.setIdade(40);
        p1.setSexo("M");
        p1.setEspecialidade("APOO");
        p1.setSalario(2500.0f);
        p1.receberAumento(500.0f);
        System.out.println(p1.toString());
        Tecnico t1 = new Tecnico();
        t1.setNome("Ronaldo");
        t1.setIdade(30);
        t1.setSexo("M");
        t1.setCurso("TADS");
        t1.setRegistroProfissional(1234);
        t1.praticar();
        System.out.println(t1.toString());
    }
}