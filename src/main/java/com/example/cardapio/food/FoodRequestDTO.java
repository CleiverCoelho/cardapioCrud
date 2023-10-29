package com.example.cardapio.food;

//  Os Records são uma nova forma de declarar classes no Java.
//  Eles são imutáveis por padrão, o que significa que não podemos alterar
//  seus valores após a criação do objeto. Além disso, eles são bastante úteis
//  para representar dados, como, por exemplo, uma entidade de banco de dados.
//  Dado a contexto de imutabilidade, existe apenas um construtor com todos os
//  atributos. Também não existem métodos setter.
//  Outra diferença entre o primeiro design e este usando records é que os métodos acessores não usam a terminologia com “get” apenas o
//  próprio nome do atributo, ou seja, ao invés de getName(), apenas name();

//  utiliza isso na hora que fazer o casting do tipo do record RequestDTO para a classe Food
//  ao passar para o banco de dados
public record FoodRequestDTO(String title, String image, Integer price) {
}
