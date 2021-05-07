# Encapsulamento

## introdução 

o Encapsulamento é um dos principios de POO , pois ele indica que quem utilizar a classe não deve poder modificar seus atributos arbitrariamente, assim deve se prober gets e seters para manipular estas propriedade, assim encapsulando a forma que elas são modificadas

## Exemplo 1
Neste exemplo temos uma demostração do uso da propriedade privete do java para encapsular váriaveis , modificando as apenas com os métodos dispostos , assim podendo fazer validações necessárias

## Exemplo 2

um grande ponto para se ficar atento e quanto utilizamos get e sets para Listas ou Objetos, pois estes podem ser modificados fora da classe assim quebrando o encapsulamento da mesma.  
### v1
 nessa primeira versão podemos notar que tipos primitivos e classes primitivas como String e int não podem ser modificadas fora,pois trabalham com uma cópia do objeto, porém quando trabalhamos com listas de string a situação muda, pois nossa classe busca os dados atráves da refência da mesma lista que passamos para fora , assim é possivel quebrar o encapsulamento da função insirindo dados maliciosos.

 No caso de classes , eu poderia modificar os atributos fora do encapsulamento atráves dos métodos ou atributos dessa classe B , porém não poderia modificar o objeto dentro da Classe People para um diferente, assim mantendo uma consistência.

### v2
Nesta versão encapsulamos o array de telefones e melhoramos o encapsulamento do atributo mother dando apenas as informações necessárias.

* para efetuar a correção da lista passando para read-only usando o método:
```java
Collections.unmodifiableList(this.phones);
```

poderiamos clonar o objeto como segunda opção assim ele poderia ser modificado ,mas não afetaria o encapsulamento interno da classe :
```java
new ArrayList<String>(this.phones);
```
