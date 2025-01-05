
## MÉTODOS DE STRING

comprimento()

Em Java, o
Visualização: Descrição do link de carregamento de documentos
length()
O método string retorna o comprimento ⁠— número total de caracteres ⁠— de um String.

Suponha que temos um Stringchamado str, str.length()retornaria seu comprimento.

Veja este código, por exemplo:

String str = "Hello World!";  

System.out.println(str.length());

Copy to Clipboard

12seria impresso porque strtem 12 caracteres:

H e l l o _ W o r l d !

Em teoria, o comprimento de a Stringé o mesmo que as unidades Unicode do String. Por exemplo, sequências de escape como \ncontam como apenas um caractere.

## Instruções
Checkpoint 1 Passed
1 .
O Twitter permite que os usuários postem tweets com um limite de caracteres. Eles capturam a mensagem que o usuário insere como um String, contam o comprimento da mensagem e usam seu comprimento para decidir se deixam ou não o usuário postar a mensagem. O limite é de 280 caracteres.

Vamos verificar se tweetsegue a política do Twitter. Imprima o número de caracteres tweetusando o length()método.

