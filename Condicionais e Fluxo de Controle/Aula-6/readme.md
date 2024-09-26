CONDICIONAIS E FLUXO DE CONTROLE
Declaração Switch
11 minutos
Uma alternativa para encadear condições if-then-else é usar a switchinstrução. Esta condicional verificará um dado valor em relação a qualquer número de condições e executará o bloco de código onde houver uma correspondência.

Aqui está um exemplo da nossa seleção de curso condicional como uma switchdeclaração:

String course = "History";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}

Este exemplo inscreve o aluno na aula de História verificando o valor contido entre parênteses, course, em relação a cada um dos caserótulos. Se o valor após o rótulo case corresponder ao valor dentro dos parênteses, o bloco switch será executado.

No exemplo acima, coursefaz referência à string "History", que corresponde a case "History":.

Quando nenhum valor corresponde, o defaultbloco é executado. Pense nisso como o elseequivalente.

Os blocos switch são diferentes de outros blocos de código porque não são marcados por chaves e usamos a breakpalavra-chave para sair da instrução switch.

Sem break, o código abaixo do rótulo correspondente caseé executado, incluindo código sob outros rótulos de caso , o que raramente é o comportamento desejado.

String course = "Biology";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
  case "Biology": 
    // Enroll in Biology
  case "History": 
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!

Instruções
Checkpoint 1 Passed
1 .
Reescreveremos o calculateShipping()método para que ele use uma switchinstrução.

Há uma variável não inicializada shippingCostem calculateShipping(). Atribua o valor correto para shippingCostusando uma switchinstrução:

Verificaremos o valor do campo de instância shipping.

Quando shippingas correspondências "Regular", shippingCostdevem ser 0.
Quando shippingas correspondências "Express", shippingCostdevem ser 1.75.
O padrão deve atribuir .50a shippingCost.
Certifique-se de que o método retorne shippingCostapós a switchinstrução.