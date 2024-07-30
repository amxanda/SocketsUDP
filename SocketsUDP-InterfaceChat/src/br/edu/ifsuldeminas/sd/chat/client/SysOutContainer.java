package br.edu.ifsuldeminas.sd.chat.client;

import br.edu.ifsuldeminas.sd.chat.MensagemRecebida;
import br.edu.ifsuldeminas.sd.chat.MessageContainer;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SysOutContainer implements MessageContainer {
    @Override
    public void newMessage(String message) {
        if (message == null || message.equals("")) {
            return;
        }
        
        String[] messageParts = message.split(MessageContainer.FROM);
        
        String horaAtual = new SimpleDateFormat("\n(HH:mm:ss) ").format(Calendar.getInstance().getTime());
        System.out.println(String.format(horaAtual + "%s: %s", messageParts[1], messageParts[0]));
        
        MensagemRecebida.mensagem = String.format(horaAtual + "%s: %s", messageParts[1], messageParts[0]);
    }
}