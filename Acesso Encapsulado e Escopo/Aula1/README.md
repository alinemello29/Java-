## O que são acesso e escopo?

À medida que nossos programas Java começam a ficar maiores e começamos a ter vários objetos e
Visualização: Descrição do link de carregamento de documentos
Aulas
que interagem entre si, os conceitos de acesso e escopo entram em jogo. Para simplificar demais as coisas, os conceitos de acesso e escopo se concentram em quais partes de seus programas podem interagir com
Visualização: Descrição do link de carregamento de documentos
variáveis
ou
Preview: Docs Methods are reusable pieces of code in classes. The difference between a method and a function is that methods are always related to a class or an object.
métodos
de outras partes do seu programa. Vamos dar uma olhada rápida em alguns dos conceitos que abordaremos:

Acesso
As palavras public- privatechave e como elas se relacionam com classes, variáveis,
Visualização: Descrição do link de carregamento de documentos
construtores
, e métodos
O conceito de encapsulamento
Métodos de acesso, às vezes conhecidos como “getters”
Métodos mutadores, às vezes conhecidos como “setters”
Escopo
Variáveis ​​locais vs. variáveis ​​de instância
A thispalavra-chave
Vamos começar!

Instruções
Veja os dois arquivos fornecidos: Bank.java e CheckingAccount.java .

Observe que os campos de instância são declarados usando a privatepalavra-chave.

Qual será a saída? Execute os arquivos Bank.java para ver.

Você obtém dois erros! É porque no main()Bank.java , estamos tentando acessar os privatecampos de instância da CheckingAccountclasse.

Tente descobrir quais variáveis ​​estão causando os erros.



