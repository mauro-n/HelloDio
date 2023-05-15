### Desafio DioBank
Desafio: Considerando nosso conhecimento no dom�nio banc�rio, iremos abstrair uma solu��o Orientada a Objetos em Java.<br/>

Para isso, vamos interpretar o seguinte cen�rio: �Um banco oferece aos seus clientes dois tipos de contas (corrente e poupan�a)<br/>
as quais possuem as funcionalidades de dep�sito, saque e transfer�ncia (entre contas da pr�pria institui��o).�

##Abstra��o
Habilidade de concentrar-se nos aspectos essenciais de um dom�nio, ignorando caracter�sticas menos importantes ou acidentais. Nesse contexto, objetos s�o abstra��es de entidades existentes no dom�nio em quest�o.

##Encapsulamento
Encapsular significa esconder a implementa��o dos objetos, criando assim interfaces de uso mais concisas e f�ceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manuten��o e a evolu��o.

##Heran�a
Permite que voc� defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros s�o herdados � chamada de classe base. A classe que herda os membros da classe base � chamada de classe derivada.

##Polimorfismo
Capacidade de um objeto poder ser referenciado de v�rias formas, ou seja, � capacidade de tratar objetos criados a partir das classes espec�ficas como objetos de uma classe gen�rica.<br/>
Cuidado, polimorfismo n�o quer dizer que o objeto fica se transformando, muito pelo contr�rio, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar � a maneira como nos referimos a ele.

### Implementa��es extras:
- Adicionei uma classe *Comprovantes*, toda opera��o realizada pelas contas gera um comprovante, que � armazenado no Banco e pode ser gerado um relat�rio das opera��es com Banco.getComprovantes();
- Adicionei funcionalidades para mostrar todos os clientes, todas as contas, o total de contas, usei classes enumeradas para padroniza��o de itens;
- O projeto toca todos os pilares da programa��o orientada a objetos.