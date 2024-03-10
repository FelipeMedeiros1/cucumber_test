# language: pt
Funcionalidade: Abrir conta no banco

  Cenário: Preencher formulário de abertura de conta com sucesso
    Dado que acesso a página de abertura de conta
    Quando eu preencho o formulário com os seguintes dados:
    Entao eu devo ver uma mensagem indicando que a conta foi aberta com sucesso
