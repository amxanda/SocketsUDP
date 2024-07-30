# Projeto de Chat em Java

Este projeto é um sistema de chat desenvolvido em Java que utiliza comunicação via UDP para enviar e receber mensagens. Inclui uma interface gráfica construída com Swing para facilitar a interação do usuário.

## Funcionalidades

- **Envio e Recebimento de Mensagens**: Comunicação em tempo real através de sockets UDP.
- **Interface Gráfica**: Interface amigável utilizando Java Swing.
- **Multithreading**: Recebimento de mensagens em segundo plano.

## Estrutura do Projeto

### Pacotes e Classes Principais

- **br.edu.ifsuldeminas.sd.chat**
  - **ChatException**: Classe para tratamento de exceções específicas do chat.
  - **ChatFactory**: Fábrica de objetos para criação de instâncias de `Sender` e inicialização do `UDPReceiver`.
  - **MessageContainer**: Interface que define o método `newMessage(String message)`.
  - **MensagemRecebida**: Classe estática para armazenar a última mensagem recebida.

- **br.edu.ifsuldeminas.sd.chat.udp**
  - **UDPReceiver**: Implementação de `Receiver` para receber mensagens via UDP.
  - **UDPSender**: Implementação de `Sender` para enviar mensagens via UDP.

- **br.edu.ifsuldeminas.sd.chat.client**
  - **Chat**: Classe principal que gerencia a conexão e envio de mensagens.
  - **SysOutContainer**: Implementa `MessageContainer` para exibir mensagens no console.

- **br.edu.ifsuldeminas.sd.chat.swing**
  - **Swing**: Interface gráfica do chat. Permite ao usuário conectar-se, enviar mensagens e visualizar mensagens recebidas.

## Interface

Abaixo está o projeto em uso:
![Teste](https://github.com/user-attachments/assets/657fc5c6-9d2c-453b-81b9-f5ba8b1c7fca)

## Protótipo no Figma

Confira o protótipo da interface gráfica do projeto no Figma:
[Protótipo no Figma](https://www.figma.com/design/RNV0IdQWz3L21iSZOExs0R/Untitled?node-id=0-1&t=4Qzn1ocF8bQIZuIC-0)

### Desenvolvedores

- **Amanda**  
  Estudante do Instituto Federal do Sul de Minas Gerais (IFSULDEMINAS).  
  GitHub: [amxanda](https://github.com/amxanda)

- **Maria Fernanda**  
  Estudante do Instituto Federal do Sul de Minas Gerais (IFSULDEMINAS).  
  GitHub: [nandinhaaa](https://github.com/nandinhaaa)


### Professor Responsável

- **Emerson de Assis Carvalho**  
  Professor do Instituto Federal do Sul de Minas Gerais (IFSULDEMINAS).  

## Obrigada

![harry-potter](https://github.com/user-attachments/assets/f247e414-5a19-45b7-8272-e9e49b926555)
