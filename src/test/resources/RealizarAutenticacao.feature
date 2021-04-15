#language: pt
#encoding: iso-8859-1


Funcionalidade: Realizar autenticação
		Como um usuário do facebook
		eu quero acessar minha conta
		de modo que eu possa visualizar o feed
		
Cenário: Realizar a autenticação de usuário cadastrado no facebook.
	Dado acessar a página de login do facebook 
	Quando preencho o campo "email" e "senha" válidos
	Então valido que o usuário fez login no facebook


Esquema do Cenário: Realizar autenticação de usuário não cadastrado
	Dado acessar a página de login do facebook 
	Quando preencho o campo <email> e <senha> que não estão cadastado
	Então exibe a mensagem O email que você inseriu não está conectado a uma conta. Encontre sua conta e entre.
	
	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
		
Esquema do Cenário: Realizar autenticação de senha inválida
	Dado acessar a página de login do facebook 
 	Quando preencho o campo <email> válido e <senha> inválida
	Então exibe a mensagem "A senha inserida está incorreta. Esqueceu a senha?" 
	
	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
	
Esquema do Cenário: Realizar autenticação com os campos email e senha em branco
	Dado acessar a página de login do facebook 
	Quando não preencho os campos <email> e <senha> e clica no botão entrar
	Então exibe a mensagem O email ou o número de celular que você inseriu não está conectado a uma conta. Encontre sua conta e entre.

	|          email           |   senha     |
  | "antoniosilva@email.com" | "Abc123456" |
	