
package telas;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import cinema_cliente.Compra;
import cinema_cliente.Ingresso;
/**
 *
 * @author mugen
 */
public class Carrinho extends javax.swing.JFrame {

    private Compra compra = new Compra(0, 1, "31/01/2023");
    private Ingresso ingresso = new Ingresso(455, true, 50.0d, 18.0f);
    private TelaInicial telaInicial;

    public TelaInicial getTelaInicial() {
        return telaInicial;
    }

    public void setTelaInicial(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }
    
    public Carrinho() {
        initComponents();
        carregarTabelaCompraIngresso();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneCarrinho = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComprasIngresso = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableComprasLanche = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart32.png"))); // NOI18N
        jLabel1.setText("Compra");

        btnFinalizar.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btnRemover.setText("Remover");

        tableComprasIngresso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Item", "Ingresso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableComprasIngresso.setEnabled(false);
        jScrollPane1.setViewportView(tableComprasIngresso);

        btnVoltar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back32.png"))); // NOI18N
        btnVoltar.setText("Voltar");

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home32.png"))); // NOI18N

        tableComprasLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Item", "Pipoca", "Bebida", "Chocolate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableComprasLanche.setEnabled(false);
        jScrollPane2.setViewportView(tableComprasLanche);

        paneCarrinho.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(btnFinalizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(btnCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(btnRemover, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(btnHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        paneCarrinho.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout paneCarrinhoLayout = new javax.swing.GroupLayout(paneCarrinho);
        paneCarrinho.setLayout(paneCarrinhoLayout);
        paneCarrinhoLayout.setHorizontalGroup(
            paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCarrinhoLayout.createSequentialGroup()
                .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCarrinhoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHome))
                    .addGroup(paneCarrinhoLayout.createSequentialGroup()
                        .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneCarrinhoLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(btnFinalizar)
                                .addGap(129, 129, 129)
                                .addComponent(btnCancelar)
                                .addGap(136, 136, 136)
                                .addComponent(btnRemover))
                            .addGroup(paneCarrinhoLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(paneCarrinhoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneCarrinhoLayout.setVerticalGroup(
            paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCarrinhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar)
                    .addComponent(btnHome))
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCarrinhoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(paneCarrinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinalizar)
                            .addComponent(btnCancelar)
                            .addComponent(btnRemover)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCarrinho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneCarrinho)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void carregarTabelaCompraIngresso() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"ID item", "Ingresso"}, 0);
        
        compra.setIngresso(ingresso);
        for (int i = 0; i < compra.getIngressos().size(); i++) {
            Object linha[] = new Object[]{compra.getIngresso(i).getId(),
                compra.getIngresso(i).getValorIngresso()
                };
            modelo.addRow(linha);
        }
            
          
        tableComprasIngresso.setModel(modelo);
    }
    
    public void carregarInformacoes() {
        
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDesktopPane paneCarrinho;
    private javax.swing.JTable tableComprasIngresso;
    private javax.swing.JTable tableComprasLanche;
    // End of variables declaration//GEN-END:variables
}
