package br.edu.ifsuldeminas.sd.chat;

import br.edu.ifsuldeminas.sd.chat.swing.Swing;

public interface MessageContainer {

    String FROM = "::de::";

    void newMessage(String message);
}
