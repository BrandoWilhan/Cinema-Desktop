/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    private Lanche telaLanche;
    private Carrinho telaCarrinho; //instanciando cada uma das telas do programa centralizadamente
    private Ingresso telaIngresso; 
    private Cadastro telaCadastro;
    private Login telaLogin;
    private Pagamento telaPagamento;
    private boolean Logado = false;

    public boolean isLogado() {
        return Logado;
    }

    public void setLogado(boolean Logado) {
        this.Logado = Logado;
    }
//    Assentos telaAssento;
    Assentos telasAssento1,telasAssento2,telasAssento3,telasAssento4,telasAssento5,telasAssento6;
    
    //ArrayList<Assentos> telasAssentos = new ArrayList<>(6);
    
    //public void PopularTelasAssentos(){
        //telasAssentos.add(telaAssento1);
        //telasAssentos.add(telaAssento2);
        //telasAssentos.add(telaAssento3);
        //telasAssentos.add(telaAssento4);
        //telasAssentos.add(telaAssento5);
        //telasAssentos.add(telaAssento6);
    //}
    
    
    
    
    public TelaInicial(Lanche telaLanche, Carrinho telaCarrinho, Ingresso telaIngresso, Cadastro telaCadastro, Login telaLogin, Pagamento telaPagamento, Assentos telaAssento1,Assentos telaAssento2,Assentos telaAssento3,Assentos telaAssento4,Assentos telaAssento5,Assentos telaAssento6) {
   
        initComponents();
        this.telaLanche = telaLanche;
        this.telaCarrinho = telaCarrinho;
        this.telaIngresso = telaIngresso;
        this.telaCadastro = telaCadastro;
        this.telaLogin = telaLogin;
        this.telaPagamento = telaPagamento;
        this.telasAssento1 = telaAssento1;
        this.telasAssento2 = telaAssento2;
        this.telasAssento3 = telaAssento3;
        this.telasAssento4 = telaAssento4;
        this.telasAssento5 = telaAssento5;
        this.telasAssento6 = telaAssento6;
        //this.telasAssentos = telasAssentos;
        //PopularTelasAssentos();
    }
    
    
    

    
    
    
    public TelaInicial() {
        initComponents();
     
    }

    public Lanche getTelaLanche() {
        return telaLanche;
    }

    public void setTelaLanche(Lanche telaLanche) {
        this.telaLanche = telaLanche;
    }

    public Carrinho getTelaCarrinho() {
        return telaCarrinho;
    }

    public void setTelaCarrinho(Carrinho telaCarrinho) {
        this.telaCarrinho = telaCarrinho;
    }

    public Ingresso getTelaIngresso() {
        return telaIngresso;
    }

    public void setTelaIngresso(Ingresso telaIngresso) {
        this.telaIngresso = telaIngresso;
    }

    public Cadastro getTelaCadastro() {
        return telaCadastro;
    }

    public void setTelaCadastro(Cadastro telaCadastro) {
        this.telaCadastro = telaCadastro;
    }

    public Login getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(Login telaLogin) {
        this.telaLogin = telaLogin;
    }

    public Pagamento getTelaPagamento() {
        return telaPagamento;
    }

    public void setTelaPagamento(Pagamento telaPagamento) {
        this.telaPagamento = telaPagamento;
    }

    public Assentos getTelasAssento1() {
        return telasAssento1;
    }

    public Assentos getTelasAssento2() {
        return telasAssento2;
    }

    public Assentos getTelasAssento3() {
        return telasAssento3;
    }

    public Assentos getTelasAssento4() {
        return telasAssento4;
    }

    public Assentos getTelasAssento5() {
        return telasAssento5;
    }

    public Assentos getTelasAssento6() {
        return telasAssento6;
    }
    
    

    //public ArrayList<Assentos> getTelasAssentos() {
        //return telasAssentos;
    //}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCarrinho = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        btnIngressos = new javax.swing.JButton();
        btnLanche = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autoatendimento");

        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart32.png"))); // NOI18N
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCadastro.setText("Cadastro");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnIngressos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnIngressos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tickets96.png"))); // NOI18N
        btnIngressos.setText("Ingressos");
        btnIngressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngressosActionPerformed(evt);
            }
        });

        btnLanche.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnLanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/popcorn_initial_96.png"))); // NOI18N
        btnLanche.setText("Lanche");
        btnLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLancheActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnCarrinho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnIngressos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLanche, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCadastro)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCarrinho)
                .addGap(40, 40, 40))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngressos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLanche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLogin)
                        .addComponent(btnCadastro))
                    .addComponent(btnCarrinho))
                .addGap(109, 109, 109)
                .addComponent(btnIngressos)
                .addGap(18, 18, 18)
                .addComponent(btnLanche)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngressosActionPerformed
        // TODO add your handling code here:
//        telaIngresso.setTelaInicial(this);
        telaIngresso.setTelaInicial(this);
        telaIngresso.setVisible(true);
        setVisible(false);        
        
    }//GEN-LAST:event_btnIngressosActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        // Met??do para abrir a tela Carrinho ao apertar o bot??o da Tela Inicial
        
        telaCarrinho.setTelaInicial(this);
        telaCarrinho.setVisible(true);
        setVisible(false);
        
        
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    private void btnLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLancheActionPerformed
        // Met??do para abrir a tela Lanche ao apertar o bot??o da Tela Inicial
        setVisible(false);
        telaLanche.setTelaInicial(this);
//        telaLanche.setTelaCarrinho(telaCarrinho);
        telaLanche.setVisible(true);
//        
    }//GEN-LAST:event_btnLancheActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
//        Met??do para abrir a tela Login ao apertar o bot??o da Tela Inicial
        setVisible(false);
        telaLogin.setTelaCadastro(telaCadastro);
        
        telaLogin.setTelaInicial(this);
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // Met??do para abrir a tela Cadastro ao apertar o bot??o da Tela Inicial
        setVisible(false);
        telaCadastro.setTelaInicial(this);
        telaCadastro.setTelaLogin(telaLogin);
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                
                Lanche telaLanche = new Lanche(); // Criando todas as telas para centralizar informa????es na Tela Inicial
                Carrinho telaCarrinho = new Carrinho();
                Ingresso telaIngresso = new Ingresso();
                Cadastro telaCadastro = new Cadastro();
                Login telaLogin = new Login();
                Pagamento telaPagamento = new Pagamento();

                Assentos telasAssentos1 = new Assentos();
                Assentos telasAssentos2 = new Assentos();
                Assentos telasAssentos3 = new Assentos();
                Assentos telasAssentos4 = new Assentos();
                Assentos telasAssentos5 = new Assentos();
                Assentos telasAssentos6 = new Assentos();
                //ArrayList<Assentos> telasAssentos = new ArrayList<>(6);
                //System.out.println(telasAssentos);
                new TelaInicial(telaLanche, telaCarrinho, telaIngresso, telaCadastro, telaLogin, telaPagamento, telasAssentos1,telasAssentos2,telasAssentos3,telasAssentos4,telasAssentos5,telasAssentos6).setVisible(true);

                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnIngressos;
    private javax.swing.JButton btnLanche;
    private javax.swing.JButton btnLogin;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
