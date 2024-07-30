package br.edu.ifsuldeminas.sd.chat.client;

import br.edu.ifsuldeminas.sd.chat.ChatException;
import br.edu.ifsuldeminas.sd.chat.ChatFactory;
import br.edu.ifsuldeminas.sd.chat.MessageContainer;
import br.edu.ifsuldeminas.sd.chat.Sender;

public class Chat {
    private int localPort, serverPort;
    private String from;
    private Sender sender;
    
    public Chat(int localPort, int serverPort, String from, String message) {
        this.localPort = localPort;
        this.serverPort = serverPort;
        this.from = from;
        conectar(message);
    }

    public void conectar(String initialMessage) {
        try {
            sender = ChatFactory.build("localhost", serverPort, localPort, new SysOutContainer());
            enviar(initialMessage);
        } catch (ChatException chatException) {
            System.err.printf("Houve algum erro no chat. Mensagem do erro: %s%n", chatException.getCause().getMessage());
        }
    }
    
    public boolean enviar(String mensagem) {
        try {
            String formattedMessage = String.format("%s%s%s", mensagem, MessageContainer.FROM, from);
            if (!formattedMessage.equals("")) {
                if (formattedMessage.equals("q")) {
                    System.exit(0);
                } else {
                    sender.send(formattedMessage);
                }
            }
        } catch (ChatException chatException) {
            System.err.printf("Houve algum erro no chat. Mensagem do erro: %s%n", chatException.getCause().getMessage());
        }
        return true;
    }
}
