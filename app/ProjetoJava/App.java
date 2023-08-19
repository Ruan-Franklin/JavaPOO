public class App{
  public static void main(String [] args){
    Gafanhoto g[] = new Gafanhoto [2];
    g [0] = new Gafanhoto("Jubileu", 22, "M", "juba");
    g [1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
    Video v[] = new Video [3];
    v[0] = new Video("Aula 1 de POO");
    Visualizacao vis[] = new Visualizacao[5];
    vis[0] = new Visualizacao(g[0], v[0]);
    vis[0].avaliar("Gostei muito");
  
    System.out.println(vis[0].toString());
    

}
}
