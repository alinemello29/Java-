APRENDA JAVA: ARRAYLISTS
Obtendo o índice de um item
4 minutos
E se tivéssemos uma lista realmente grande e quiséssemos saber a posição de um determinado elemento nela? Por exemplo, e se tivéssemos uma
Preview: Docs Loading link description
ArrayList
 detectivescom os nomes de detetives fictícios em ordem cronológica, e queríamos saber qual "Fletcher"era a posição.

// detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
System.out.println(detectives.indexOf("Fletcher"));

Este código imprimiria 4, pois "Fletcher"está no índice 4do detectives ArrayList.

Instruções
Checkpoint 1 Passed
1 .
Depois de visitar a cena do crime, o sempre impaciente Dr. Watson quer saber quantas tarefas faltam até Sherlock resolver o caso.

Para ajudar o Dr. Watson a descobrir isso, use indexOf()para determinar onde está na lista de tarefas "solve the case".

Imprima esta informação. Esse é o número de tarefas restantes antes que Sherlock chegue a "solve the case".