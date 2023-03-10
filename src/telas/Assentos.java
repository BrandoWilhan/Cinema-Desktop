/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import cinema_cliente.Compra;
import cinema_cliente.Ticket;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author joaou
 */
public class Assentos extends javax.swing.JFrame {

    /**
     * Creates new form Assentosframe
     */
    
    Ingresso telaIngresso;
    Assentos telaAssento;
    TelaInicial telaInicial;
    Carrinho telaCarrinho;
    Ticket ingresso;

    int quantidadeTotal;

    public Assentos(Ticket ingresso) {
         initComponents();
        this.ingresso = ingresso;
    }
    
    public Assentos() {
         initComponents();
    }

    
    public void setTelaInicial(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }
    
    
    
    
    ArrayList<JToggleButton> buttons = new ArrayList<>();
    ArrayList<String> selecionados = new ArrayList<>();
    //ArrayList<String> ocupados = new ArrayList<>();
    
    public void adicionarList(){
        buttons.add(bttnA1);
        buttons.add(bttnA2);
        buttons.add(bttnA3);
        buttons.add(bttnA4);
        buttons.add(bttnA5);
        buttons.add(bttnA6);
        buttons.add(bttnB1);
        buttons.add(bttnB2);
        buttons.add(bttnB3);
        buttons.add(bttnB4);
        buttons.add(bttnB5);
        buttons.add(bttnB6);
        buttons.add(bttC1);
        buttons.add(bttC2);
        buttons.add(bttC3);
        buttons.add(bttC4);
        buttons.add(bttC5);
        buttons.add(bttC6);
        buttons.add(bttD1);
        buttons.add(bttD2);
        buttons.add(bttD3);
        buttons.add(bttD4);
    }
    
    //public void adicionarOcupados(JToggleButton button){
        //if(button.isEnabled() == false)
    //}
    
    public int contarSelecionados(ArrayList<JToggleButton> buttons){
        int i = 0;
        for (int j = 0; j < 22; j++) {
         if(buttons.get(j).isSelected()){
          i = i+1;  
         }
        }
        return i;
    }
    public void desativarSelecionados(JToggleButton buttons){
        if(buttons.isSelected()){
            buttons.setEnabled(false);
            buttons.setSelected(false);
            selecionados.add(buttons.getText());
        }
    }

    public ArrayList<String> getSelecionados() {
        return selecionados;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bttnVoltar = new javax.swing.JButton();
        bttnCancelar = new javax.swing.JButton();
        bttnConfirmar1 = new javax.swing.JButton();
        bttC5 = new javax.swing.JToggleButton();
        bttC6 = new javax.swing.JToggleButton();
        bttD1 = new javax.swing.JToggleButton();
        bttD2 = new javax.swing.JToggleButton();
        bttD3 = new javax.swing.JToggleButton();
        bttD4 = new javax.swing.JToggleButton();
        bttnA6 = new javax.swing.JToggleButton();
        bttnA1 = new javax.swing.JToggleButton();
        bttnB1 = new javax.swing.JToggleButton();
        bttnB3 = new javax.swing.JToggleButton();
        bttnB4 = new javax.swing.JToggleButton();
        bttnB5 = new javax.swing.JToggleButton();
        bttnB6 = new javax.swing.JToggleButton();
        bttC1 = new javax.swing.JToggleButton();
        bttC2 = new javax.swing.JToggleButton();
        bttnA2 = new javax.swing.JToggleButton();
        bttnA3 = new javax.swing.JToggleButton();
        bttnA4 = new javax.swing.JToggleButton();
        bttnA5 = new javax.swing.JToggleButton();
        bttnB2 = new javax.swing.JToggleButton();
        bttC3 = new javax.swing.JToggleButton();
        bttC4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(62, 67, 76));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Escolha entre os assentos dispon??veis:");

        bttnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back32.png"))); // NOI18N
        bttnVoltar.setText("Voltar");
        bttnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnVoltarActionPerformed(evt);
            }
        });

        bttnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttnCancelar.setText("Cancelar");
        bttnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnCancelarActionPerformed(evt);
            }
        });

        bttnConfirmar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bttnConfirmar1.setText("Confirmar");
        bttnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConfirmar1ActionPerformed(evt);
            }
        });

        bttC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC5.setText("C5");

        bttC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC6.setText("C6");

        bttD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttD1.setText("D1");
        bttD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttD1ActionPerformed(evt);
            }
        });

        bttD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttD2.setText("D2");
        bttD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttD2ActionPerformed(evt);
            }
        });

        bttD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttD3.setText("D3");
        bttD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttD3ActionPerformed(evt);
            }
        });

        bttD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttD4.setText("D4");
        bttD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttD4ActionPerformed(evt);
            }
        });

        bttnA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA6.setText("A6");
        bttnA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnA6ActionPerformed(evt);
            }
        });

        bttnA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA1.setText("A1");
        bttnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnA1ActionPerformed(evt);
            }
        });

        bttnB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB1.setText("B1");

        bttnB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB3.setText("B3");

        bttnB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB4.setText("B4");

        bttnB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB5.setText("B5");

        bttnB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB6.setText("B6");

        bttC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC1.setText("C1");
        bttC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttC1ActionPerformed(evt);
            }
        });

        bttC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC2.setText("C2");

        bttnA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA2.setText("A2");

        bttnA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA3.setText("A3");

        bttnA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA4.setText("A4");

        bttnA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnA5.setText("A5");

        bttnB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttnB2.setText("B2");

        bttC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC3.setText("C3");

        bttC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chair_seat_furniture_icon_209747.png"))); // NOI18N
        bttC4.setText("C4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnVoltar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttnConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttnB6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttC1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bttD1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttD2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttD3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttD4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bttC2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttC3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttC4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttC5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bttC6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bttnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(bttnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bttnA6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttnVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnA5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnA6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnB3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnB4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnB5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnB6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttC2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttC3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttC4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttC5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttC6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttC1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttD1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttD2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttD4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttD3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttD1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bttD1ActionPerformed

    private void bttD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttD2ActionPerformed

    private void bttD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttD3ActionPerformed

    private void bttD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttD4ActionPerformed

    private void bttnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnA1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bttnA1ActionPerformed

    private void bttnA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnA6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnA6ActionPerformed

    private void bttnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnVoltarActionPerformed
        // TODO add your handling code here:
        //telaIngresso = telaInicial.telaIngresso;
        //telaIngresso.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bttnVoltarActionPerformed

    private void bttC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttC1ActionPerformed

    private void bttnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConfirmar1ActionPerformed
        // TODO add your handling code here:
        adicionarList();
        selecionados.clear();
        quantidadeTotal = ingresso.getQuantidadeInteira()+ingresso.getQuantidadeMeia();

        for (int i = 0; i < 22; i++) {
            int count = contarSelecionados(buttons);
            if(count == quantidadeTotal){
                desativarSelecionados(buttons.get(i));
                telaCarrinho = telaInicial.getTelaCarrinho();
                telaCarrinho.setTelaInicial(telaInicial);
                telaCarrinho.setVisible(true);
                setVisible(false);
                break;
            } else{
                JOptionPane.showMessageDialog(this, "Por favor selecione somente a quantidade de ingressos que comprou: " + quantidadeTotal, "Quantidade Inv??lida", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        

    }//GEN-LAST:event_bttnConfirmar1ActionPerformed

    private void bttnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnCancelarActionPerformed
        // TODO add your handling code here:
        adicionarList();
        for (int i = 0; i < 22; i++) {
            if(buttons.get(i).isSelected() || selecionados.contains(buttons.get(i).getText())){
                buttons.get(i).setSelected(false);
            }
        }
    }//GEN-LAST:event_bttnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Assentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assentos().setVisible(true);   
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bttC1;
    private javax.swing.JToggleButton bttC2;
    private javax.swing.JToggleButton bttC3;
    private javax.swing.JToggleButton bttC4;
    private javax.swing.JToggleButton bttC5;
    private javax.swing.JToggleButton bttC6;
    private javax.swing.JToggleButton bttD1;
    private javax.swing.JToggleButton bttD2;
    private javax.swing.JToggleButton bttD3;
    private javax.swing.JToggleButton bttD4;
    private javax.swing.JToggleButton bttnA1;
    private javax.swing.JToggleButton bttnA2;
    private javax.swing.JToggleButton bttnA3;
    private javax.swing.JToggleButton bttnA4;
    private javax.swing.JToggleButton bttnA5;
    private javax.swing.JToggleButton bttnA6;
    private javax.swing.JToggleButton bttnB1;
    private javax.swing.JToggleButton bttnB2;
    private javax.swing.JToggleButton bttnB3;
    private javax.swing.JToggleButton bttnB4;
    private javax.swing.JToggleButton bttnB5;
    private javax.swing.JToggleButton bttnB6;
    private javax.swing.JButton bttnCancelar;
    private javax.swing.JButton bttnConfirmar1;
    private javax.swing.JButton bttnVoltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
