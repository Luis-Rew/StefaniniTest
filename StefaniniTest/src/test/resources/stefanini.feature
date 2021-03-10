#language:pt
#Author: luisfelipe_9831@hotmail.com


Funcionalidade: Validar Cadastro de Usuário 
   Como usuário quero me cadastrar na lista de usuários

  @CT01
  Cenário: Cadastrar nome como Usuário
    Dado que eu acesse "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando escrever meu nome "Luis Felipe"
    E escrever meu e-mail "luisfelipe_9831@hotmail.com"
    E digitar uma nova senha
    E clicar em cadastrar
    Então meu nome deverá aparecer na lista de Usuários Cadastrados "1"
    
    @CT02
 Cenário: Validar Mensagem de erro do nome, e-mail e senha
 Dado que eu acesso "http://prova.stefanini-jgr.com.br/teste/qa/"
 Quando escrever meu nome incompleto "Luis"
 E escrever meu e-mail incompleto "luis@luis"
 E clicar em cadastrar 
 Então deverá aparecer mensagem de erro no nome "Por favor, insira um nome completo."
 E mensagem de erro no e-mail "Por favor, insira um e-mail válido."
 E mostrar que é obrigatório o uso de senha  "O campo Senha é obrigatório."
 
 @CT03 
 Cenário: Retirar um nome da lista de Usuários Cadastrados
 Dado que eu acesse "http://prova.stefanini-jgr.com.br/teste/qa/"
 Quando escrever meu nome "Victor Santos"
 E escrever meu e-mail "victorsantos@hotmail.com"
 E digitar uma nova senha
 E clicar em cadastrar 
 E digitar um novo nome "Fabricio Nunes"
 E escrever um novo e-mail "fabricio_123@hotmail.com"
 E digitar uma nova senha
 E clicar em cadastrar
 Então deverá aparecer os usuários cadastrados "Usuários cadastrados" 
 Então clico em excluir o primeiro usuário
 E valido que o segundo nome permaneceu na lista "2"
 

 
