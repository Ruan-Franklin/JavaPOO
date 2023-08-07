public class ProjetoPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("Pedro");
        p1.setIdade(20);
        p1.setSexo("M");
        p1.fazerAniversario();
        p2.setNome("Maria");
        p2.setIdade(18);
        p2.setSexo("F");
        p2.setCurso("Informática");
        p2.setMatricula(1111);
        p2.fazerAniversario();
        p3.setNome("Cláudio");
        p3.setIdade(29);
        p3.setSexo("M");
        p3.setSetor("Estoque");
        p3.mudarTrabalho();
        p4.setNome("Fabiana");
        p4.setIdade(35);
        p4.setSexo("F");
        p4.setSalario(2500.75f);
        p4.receberAumento(450.24f);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
