Biblioteca para manipulação de cartas de um Baralho

VISÃO GERAL

A biblioteca de manipulação de baralho, por padrão o tradicional de 52 cartas sem curingas, que  fornece uma representação das cartas e funções/métodos/etc para manipulação das cartas. São definidas as funções de  embaralhar, cortar em duas partes (em uma determinada posição e juntando em um único baralho no final), retirar uma carta do inicio e do final, passar uma carta do inicio para o final (sem mostrar que carta é), e a criação de um monte de descarte do qual podemos ver qualquer carta sem removê-la (no monte de compra uma carta só pode ser vista se for removida dele).

----------------------------------------------------------

REQUISITOS PARA A COMPILAÇÃO

Ant corretamente instalado
JDK
Conexão com a internet

----------------------------------------------------------

CONTEÚDO DA BIBLIOTECA

Uma classe Carta contendo o naipe e o numero da carta no formato de String
Uma classe Baralho contendo um ArrayList de Carta e as funções para manipular o baralho
Uma classe MonteDeDescarte contendo um ArrayList de Carta e as funções para manipular o monte de descarte

----------------------------------------------------------

INSTRUÇÕES PARA COMPILAR A BIBLIOTECA

Navegar até a pasta do projeto onde se encontra o arquivo build.xml

Executar o comando "ant" pelo cmd ou terminald do sistema

Aguardar o final da execução do comando.

Será criada uma pasta chamada doc contendo o javadoc da api e uma pasta dist contendo o executável

Para usar a biblioteca basta importá-la no seu projeto seguindo as orientações da sua IDE.