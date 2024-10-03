OPERADORES CONDICIONAIS
Análise
<1 minuto
Operadores condicionais trabalham em valores booleanos para simplificar nosso código. Eles são frequentemente combinados com instruções condicionais para consolidar a lógica de ramificação.

Condicional-AND, &&, avalia truese os booleanos em ambos os lados são true.

if (true && false) {
  System.out.println("You won't see me print!");
} else if (true && true) {
  System.out.println("You will see me print!");
}

Condicional-OU, ||, avalia truese um ou ambos os booleanos de cada lado são true.

if (false || false) {
  System.out.println("You won't see me print!");
} else if (false || true) {
  System.out.println("You will see me print!");
}

Logical-NOT, !, é avaliado como o valor booleano oposto ao qual é aplicado.

if (!false) {
  System.out.println("You will see me print!");
}

Instruções
A Reservationclasse completa está no editor de código.

Brinque internamente main()e veja se você consegue criar instâncias que executarão todas as ramificações condicionais possíveis.