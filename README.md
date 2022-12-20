# RedeSocial

Programa desenvolvido simulando uma rede social para o módulo de Lógica da Programação do curso Sinqia #dev_makers v.2 ministrada pela Ada


## Programa

Desenvolver um programa simulando uma rede social onde o usuário vai fazer um cadastro, postar mensagens e visualizar a Timeline.

### Funcionamento e regra de negócio

- Ao iniciar o programa deve ter uma tela inicial com as opções de cadastrar usuário, entrar e fechar;
  - Você deve entrar com o comando "C" se quiser "Cadastrar", "E" se quiser "Entrar" ou "F" se quiser "Fechar" o programa";
- Ao selecionar "Cadastrar", o usuário deve iserir um nome, login e senha;
  - Os campos não podem ser vazios;
  - Não pode ser cadastrado um login ou senha já existentes;
  - Após o cadastro bem sucedido, o programa retorna para a tela inicial;
- Ao selecionar a opção "Entrar", o usuário deve entrar com um login e senha;
  - O usuário deve entrar com um login cadastrado;
  - A senha deve ser a mesma cadastrada para o login escolhido pelo usuário;
- Ao efetuar o login com sucesso, uma página "Menu" será iniciada com as opções "Postar", "Ver sua timeline", "Ver Timeline dos usuários da Rede Social" e "Sair";
  - Você deve entrar com o comando "1" se quiser "Postar", "2" se quiser "Ver sua Timeline", "3" se quiser "Ver Timeline dos usuários da Rede Social" ou "4" para "Sair";
- Ao selecionar postar você deve adicionar a data, hora e conteúdo do Post;
  - O conteudo deve ser um texto;
  - Ao finalizar a postagem uma mensagem é enviada;
- Ao selecionar ver sua timeline, será exibida todos os posts do usuário;
- Ao selecionar ver timeline dos usuarios da rede social, será exibida todos os posts dos usuários cadastrados no programa;
- Ao selecionar Sair, o programa retorna a tela inicial.


### Organização do código

- Main: Classe que contém o método main;
- Models:
  - Usuario: Classe composto por nome, login, senha e lista de posts;
  - Post: Classe composta por data, hora e conteúdo;
- Excpetions: Possui as classes de Exception que serão lançadas no código;
- Repositories:
  - PostRepository: Responsável por interações com a lista de posts do usuário, como pegar um post ou adicionar um post;
  - UsuarioRepository: Responsável por interações com a lista de usuários cadastrados, como achar um usuário, adicionar usuário, pegar usuário, etc.
- Services: Responsável pelas regras de negócio
  - Cadastrar: Responsável por cadastrar o usuário;
  - Iniciar: Responsável por iniciar o programa e determinar qual a primeira ação que será realizada (Cadastrar, Entrar ou Fechar);
  - Logar: Responsável por efetuar o login do usuário;
  - Menu: Responsável pelo menu após o login ser realizado;
  - Postar: Responsável por fazer um post do usuário;
  - Timeline: Resonsável por mostrar as Timelines;
  - Validador: Responsável por validar nomes, logins e senhas.

### Melhorias futuras

- Adicionar a opção de visualizar a timeline de um usuário específico;
- Adiconar a opção de seguir outros usuarios;

