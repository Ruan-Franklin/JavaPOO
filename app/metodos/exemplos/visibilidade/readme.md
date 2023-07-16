# Métodos especiais
Métodos especiais são aqueles que permitem acessar ou modificar os atributos de um objeto de forma controlada e segura. Eles são divididos em dois tipos: métodos acessores e métodos modificadores.

Métodos acessores, também chamados de getters, são métodos que retornam o valor de um determinado atributo de um objeto. Eles são úteis para obter informações sobre o estado do objeto sem alterá-lo. Por exemplo, se temos uma classe Estante que representa uma estante de documentos, podemos ter um método getTotDoc que retorna o número total de documentos na estante:
```
Estante e = new Estante(); // cria um objeto do tipo Estante
int t = e.getTotDoc(); // obtém o valor do atributo totDoc do objeto e
```
Métodos modificadores, também chamados de setters, são métodos que alteram o valor de um determinado atributo de um objeto. Eles são úteis para modificar o estado do objeto de acordo com alguma regra ou validação. Por exemplo, se temos uma classe Estante que representa uma estante de documentos, podemos ter um método setTotDoc que recebe um número inteiro como parâmetro e altera o valor do atributo totDoc do objeto e:
```
Estante e = new Estante(); // cria um objeto do tipo Estante
e.setTotDoc(10); // altera o valor do atributo totDoc do objeto e para 10```
