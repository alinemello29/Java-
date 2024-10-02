OPERADORES CONDICIONAIS
Combinando operadores condicionais
4 minutos
Temos a capacidade de expandir nossas expressões booleanas usando vários operadores condicionais em uma única expressão.

Por exemplo:

boolean foo = true && !(false || !true)

Como uma expressão como essa é avaliada pelo compilador? A ordem de avaliação quando se trata de operadores condicionais é a seguinte:

Condições colocadas entre parênteses -()
NÃO -!
E -&&
OU -||
Usando essas informações, vamos dissecar a expressão acima para encontrar o valor de foo:

true && !(false || !true)

Primeiro, avaliaremos (false || !true) porque ele está entre parênteses. Seguindo a ordem de avaliação, avaliaremos !true, que é igual a false:

true && !(false || false)

Então, avaliaremos (false || false)qual é igual a false. Agora nossa expressão se parece com isso:

true && !false

Em seguida, avaliaremos !falseporque ele usa o operador NOT. Esta expressão é igual truea fazer nossa expressão a seguinte:

true && true

true && trueavalia para true; portanto, o valor de fooé true.

Instruções
Dê uma olhada nas três expressões em Operators.java .

Usando sua compreensão da ordem de execução, descubra se o valor de cada expressão é trueou false.

Quando estiver pronto, descomente as instruções de impressão para descobrir se você está certo.