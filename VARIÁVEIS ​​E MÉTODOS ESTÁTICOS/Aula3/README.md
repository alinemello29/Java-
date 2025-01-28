## Variáveis e Métodos Estáticos

Modificando Variáveis Estáticas

Nesta seção, vamos explorar como modificar variáveis estáticas em Java. 🛠️✨ Agora que já criamos algumas variáveis estáticas, é hora de aprender a editá-las.

Acesso a Variáveis Estáticas
A boa notícia é que editar variáveis estáticas é semelhante a editar qualquer outra variável. Você pode acessar e modificar variáveis estáticas em construtores, métodos não estáticos e métodos estáticos.

Quando Editar Variáveis Estáticas?
Normalmente, você verá variáveis estáticas usadas para manter o controle de informações sobre todos os objetos de uma classe. Por exemplo, considere a variável numATMs, que armazena o número total de ATMs no sistema. Aqui está como você pode gerenciá-la:

Criação de um ATM: Sempre que um novo ATM é criado, devemos aumentar numATMs em 1.
Destruição de um ATM: Se um ATM for destruído, o método que realiza essa operação deve diminuir numATMs em 1.
Além disso, temos uma variável chamada totalMoney, que monitora a quantidade total de dinheiro em todos os ATMs. Quando um usuário realiza um saque usando o método withdrawMoney(), devemos atualizar tanto a variável de instância money desse ATM específico quanto a variável estática totalMoney.

Instruções
Checkpoint 1
Edite o construtor da classe ATM para aumentar numATMs em 1 toda vez que um ATM for criado. No método main, você deve estar imprimindo numATMs antes e depois de criar alguns ATMs. Espere ver esse número aumentar conforme você cria novos ATMs. 📈
Checkpoint 2
Modifique o construtor para que, quando um novo ATM for criado, a quantia de dinheiro que o ATM começa a ter seja adicionada à variável estática totalMoney.
Checkpoint 3
Edite o método withdrawMoney() para que, quando o dinheiro for retirado de um ATM específico, a variável estática totalMoney também reflita essa alteração.
Dê uma olhada no método main() — você verá que estamos imprimindo totalMoney antes e depois de realizar saques em alguns ATMs. 💵

Conclusão
Compreender como modificar variáveis estáticas é crucial para gerenciar informações compartilhadas entre todos os objetos de uma classe. Se tiver alguma dúvida ou precisar de ajuda, sinta-se à vontade para perguntar! 😊💻