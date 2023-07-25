Caminhos para os arquivos principais:
btv.sable -> src/
Main.java -> src/btv/
arquivos .btv -> teste/

Ao clicar no botão "Run", serão executadas as seguintes tarefas:

  - Execucão do sablecc utilizando o arquivo "btv.sable" como parâmetro,

  - Compilação dos arquivos .java gerados pelo sable e do arquivo "Main.java",

  - Execução do arquivo "Main.class".

Para configurar o nome do arquivo .btv a ser analisado, basta alterar a string de arquivo, que se encontra na linha 12 do arquivo "Main.java". Por convenção, os arquivos .btv a serem analisados devem se encontrar na pasta "teste", e a string deve ser no formato:

  "teste/nome_do_arquivo.btv"

Na execução do programa, serão impressas na tela linhas no formato:

  class.btv.node.TNomeDoToken -> ( lexema_reconhecido )

, com exceção do token vazio.

