#language: pt
#encoding: iso-8859-1


Funcionalidade: Realizar autentica��o
		Como um usu�rio do facebook
		eu quero acessar minha conta
		de modo que eu possa visualizar o feed
		
Cen�rio: Realizar a autentica��o de usu�rio cadastrado no facebook.
	Dado acessar a p�gina de login do facebook 
	Quando preencho o campo "email" e "senha" v�lidos
	Ent�o valido que o usu�rio fez login no facebook


Esquema do Cen�rio: Realizar autentica��o de usu�rio n�o cadastrado
	Dado acessar a p�gina de login do facebook 
	Quando preencho o campo <email> e <senha> que n�o est�o cadastado
	Ent�o exibe a mensagem O email que voc� inseriu n�o est� conectado a uma conta. Encontre sua conta e entre.
	
	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
		
Esquema do Cen�rio: Realizar autentica��o de senha inv�lida
	Dado acessar a p�gina de login do facebook 
 	Quando preencho o campo <email> v�lido e <senha> inv�lida
	Ent�o exibe a mensagem "A senha inserida est� incorreta. Esqueceu a senha?" 
	
	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
	
Esquema do Cen�rio: Realizar autentica��o com os campos email e senha em branco
	Dado acessar a p�gina de login do facebook 
	Quando n�o preencho os campos <email> e <senha> e clica no bot�o entrar
	Ent�o exibe a mensagem O email ou o n�mero de celular que voc� inseriu n�o est� conectado a uma conta. Encontre sua conta e entre.

	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
	