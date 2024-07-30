/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsuldeminas.sd.chat.swing;

import br.edu.ifsuldeminas.sd.chat.MensagemRecebida;
import br.edu.ifsuldeminas.sd.chat.client.Chat;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Amanda e Maria Fernanda
 */
public class Swing extends javax.swing.JFrame {

    private int localPort, serverPort;
    private String from;
    private Chat chat;

    /**
     * Creates new Swing
     */
    public Swing() {
        initComponents();
    }

    private void ThreadReceberMensagem() {
        SwingWorker<Void, String> Worker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                while (true) {
                    Thread.sleep(50);
                    atualizar();
                }
            }
        };
        Worker.execute();
    }

    public void atualizar() {
        panelMensagem.setText(panelMensagem.getText() + MensagemRecebida.mensagem);
        MensagemRecebida.mensagem = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelMensagem = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        txtMensagem = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JLabel();
        inputPortaLocal = new javax.swing.JTextField();
        txtPortaLocal = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        txtNome = new javax.swing.JLabel();
        inputPortaRemota = new javax.swing.JTextField();
        txtPortaRemota = new javax.swing.JLabel();
        btnConectar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menuLateral = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMensagem.setEditable(false);
        panelMensagem.setBorder(null);
        panelMensagem.setEnabled(false);
        jScrollPane1.setViewportView(panelMensagem);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 570, 430));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Escreva a sua mensagem:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 160, -1));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsuldeminas/sd/chat/swing/enviar.png"))); // NOI18N
        btnEnviar.setBorder(null);
        btnEnviar.setEnabled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, -1, -1));

        txtMensagem.setEnabled(false);
        txtMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensagemActionPerformed(evt);
            }
        });
        txtMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMensagemKeyPressed(evt);
            }
        });
        getContentPane().add(txtMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 450, 30));

        btnLimpar.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, -1, -1));

        inputPortaLocal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133)));
        inputPortaLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPortaLocalActionPerformed(evt);
            }
        });
        getContentPane().add(inputPortaLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 30));

        txtPortaLocal.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txtPortaLocal.setForeground(new java.awt.Color(255, 255, 255));
        txtPortaLocal.setText("Porta local:");
        getContentPane().add(txtPortaLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 10));

        inputNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133)));
        inputNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        inputNome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        inputNome.setName(""); // NOI18N
        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });
        getContentPane().add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 30));

        txtNome.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Nome:");
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, -1));

        inputPortaRemota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133), new java.awt.Color(67, 214, 133)));
        inputPortaRemota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPortaRemotaActionPerformed(evt);
            }
        });
        getContentPane().add(inputPortaRemota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 30));

        txtPortaRemota.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        txtPortaRemota.setForeground(new java.awt.Color(255, 255, 255));
        txtPortaRemota.setText("Porta remota:");
        getContentPane().add(txtPortaRemota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 10));

        btnConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsuldeminas/sd/chat/swing/conectar.png"))); // NOI18N
        btnConectar.setBorder(null);
        btnConectar.setMaximumSize(new java.awt.Dimension(77, 20));
        btnConectar.setMinimumSize(new java.awt.Dimension(77, 20));
        btnConectar.setPreferredSize(new java.awt.Dimension(77, 20));
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsuldeminas/sd/chat/swing/iconChat.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 130, -1));
        jLabel8.getAccessibleContext().setAccessibleName("iconChat");

        menuLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsuldeminas/sd/chat/swing/menuLateral.png"))); // NOI18N
        getContentPane().add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsuldeminas/sd/chat/swing/Chat Interface.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String horaAtual = new SimpleDateFormat("\n(hh:mm:ss) ").format(Calendar.getInstance().getTime());
        String enviar = txtMensagem.getText();
        panelMensagem.setText(panelMensagem.getText() + String.format(horaAtual + "Eu: %s", enviar));
        txtMensagem.setText("");
        chat.enviar(enviar);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensagemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviarActionPerformed(null);
        }
    }//GEN-LAST:event_txtMensagemKeyPressed

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        panelMensagem.setText("");
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        if (inputNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' nao foi preenchido", "Valor invalido.", JOptionPane.INFORMATION_MESSAGE);
            inputNome.requestFocus();
        } else if (inputPortaLocal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Porta Local' nao foi preenchido", "Valor invalido.", JOptionPane.INFORMATION_MESSAGE);
            inputPortaLocal.requestFocus();
        } else if (inputPortaRemota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo 'Porta Remota' nao foi preenchido", "Valor invalido.", JOptionPane.INFORMATION_MESSAGE);
            inputPortaRemota.requestFocus();
        } else if (!inputPortaLocal.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "O campo 'Porta Local' nao e um numero valido.", "Valor invalido.", JOptionPane.INFORMATION_MESSAGE);
            inputPortaLocal.requestFocus();
        } else if (!inputPortaRemota.getText().matches("[0-9]*")) {
            JOptionPane.showMessageDialog(null, "O campo 'Porta Remota' nao e um numero valido.", "Valor invalido.", JOptionPane.INFORMATION_MESSAGE);
            inputPortaRemota.requestFocus();
        } else {
            int localPort = Integer.parseInt(inputPortaLocal.getText());
            int serverPort = Integer.parseInt(inputPortaRemota.getText());
            if (localPort < 1 || localPort > 65536) {
                JOptionPane.showMessageDialog(null, "O numero digitado em 'Porta Local' e invalido\nDigite uma porta entre 1 e 65536", "Numero da porta invalido", JOptionPane.INFORMATION_MESSAGE);
                inputPortaLocal.requestFocus();
            } else if (serverPort < 1 || serverPort > 65536) {
                JOptionPane.showMessageDialog(null, "O numero digitado em 'Porta Remota' e invalido\nDigite uma porta entre 1 e 65536", "Numero da porta invalido", JOptionPane.INFORMATION_MESSAGE);
                inputPortaRemota.requestFocus();
            } else {
                ThreadReceberMensagem();
                from = inputNome.getText();

                String message = "[Conexão estabelecida com sucesso]";
                chat = new Chat(localPort, serverPort, from, message);

                btnConectar.setEnabled(false);
                inputNome.setEnabled(false);
                inputPortaRemota.setEnabled(false);
                txtMensagem.setEnabled(true);
                btnEnviar.setEnabled(true);
                panelMensagem.setEnabled(true);
                inputPortaLocal.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputPortaRemotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPortaRemotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPortaRemotaActionPerformed

    private void inputPortaLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPortaLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPortaLocalActionPerformed

    private void txtMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensagemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel btnLimpar;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPortaLocal;
    private javax.swing.JTextField inputPortaRemota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menuLateral;
    private javax.swing.JTextPane panelMensagem;
    private javax.swing.JTextField txtMensagem;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPortaLocal;
    private javax.swing.JLabel txtPortaRemota;
    // End of variables declaration//GEN-END:variables
}
