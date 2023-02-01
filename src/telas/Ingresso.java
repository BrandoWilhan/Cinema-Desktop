
package telas;

import cinema_cliente.Filme;
import cinema_cliente.Sala;
import cinema_cliente.Ticket;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mugen
 */
public class Ingresso extends javax.swing.JFrame
{

    /**
     * Creates new form Ingresso
     */
    TelaInicial telaInicial;
    Assentos telaAssento;

    public Ingresso()
    {
        initComponents();
        populateTable();
    }

    public TelaInicial getTelaInicial() {
        return telaInicial;
    }

    public void setTelaInicial(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }
    
    Sala sala1 = new Sala("1");
    Sala sala2 = new Sala("2");
    Sala sala3 = new Sala("3");
    
    Filme filme1 = new Filme("Avatar: O Caminho da Água", "14", sala1);
    Filme filme2 = new Filme("Pantera Negra: Wakanda para Sempre", "12", sala2);
    Filme filme3 = new Filme("O Homem do Norte", "18", sala3);
    Filme filme4 = new Filme("Não, Não Olhe", "14", sala1);
    Filme filme5 = new Filme("The Batman", "13", sala2);
    Filme filme6 = new Filme("Top Gun: Maverick", "12", sala3);

    
    public void populateTable(){
        String columns[] = {"Nome do Filme", "Classificação Indicativa", "Sala", "Horário"};
        String data [][] = {{filme1.getTitulo(), filme1.getClassificacao(), filme1.getSala().getNumeroSala(), "14:00"}, 
            {filme2.getTitulo(), filme2.getClassificacao(), filme2.getSala().getNumeroSala(), "14:00"},
            {filme3.getTitulo(), filme3.getClassificacao(), filme3.getSala().getNumeroSala(), "14:00"}, 
            {filme4.getTitulo(), filme4.getClassificacao(), filme4.getSala().getNumeroSala(), "16:00"}, 
            {filme5.getTitulo(), filme5.getClassificacao(), filme5.getSala().getNumeroSala(), "16:00"}, 
            {filme6.getTitulo(), filme6.getClassificacao(), filme6.getSala().getNumeroSala(), "16:00"}
            
        };
        DefaultTableModel model = new DefaultTableModel(data, columns){
            @Override
            //Impedir de ser possível de editar
            public boolean isCellEditable(int row, int column) {
            return false;
    }
        };
        tblFilmes.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnHome = new javax.swing.JButton();
        lblIngresso = new javax.swing.JLabel();
        spnQuantidadeMeia = new javax.swing.JSpinner();
        btnConfirmar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        lblFilmes = new javax.swing.JLabel();
        lblIngressoMeia = new javax.swing.JLabel();
        spnQuantidadeInteira = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFilmes = new javax.swing.JTable();
        txtPesquisarFilme = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home32.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblIngresso.setFont(new java.awt.Font("Segoe UI", 1, 14)
        );
        lblIngresso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concertticket_83678.png"))); // NOI18N
        lblIngresso.setText("Ingresso(s) Meia");

        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 24));
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 24));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblFilmes.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon claquete.png"))); // NOI18N
        lblFilmes.setText("Filmes");

        lblIngressoMeia.setFont(new java.awt.Font("Segoe UI", 1, 14)
        );
        lblIngressoMeia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concertticket_83678.png"))); // NOI18N
        lblIngressoMeia.setText("Ingresso(s) Inteira");

        tblFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFilmes);
        if (tblFilmes.getColumnModel().getColumnCount() > 0) {
            tblFilmes.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            tblFilmes.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            tblFilmes.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            tblFilmes.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back32.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblIngresso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spnQuantidadeMeia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnConfirmar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblFilmes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lblIngressoMeia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spnQuantidadeInteira, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(txtPesquisarFilme, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFilmes)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(lblIngressoMeia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnQuantidadeInteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPesquisarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnPesquisar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQuantidadeMeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome)
                    .addComponent(btnVoltar))
                .addGap(18, 18, 18)
                .addComponent(lblFilmes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngressoMeia)
                    .addComponent(spnQuantidadeInteira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresso)
                    .addComponent(spnQuantidadeMeia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        DefaultTableModel obj = (DefaultTableModel)tblFilmes.getModel();
        int i;
        for (i = 0; i < obj.getRowCount(); i++) {
            if(txtPesquisarFilme.getText().equals(obj.getValueAt(i, 0))){
                JOptionPane.showMessageDialog(this, "Filme Encontrado!");
                break;
            }
        }
            if (i==obj.getRowCount()){
                JOptionPane.showMessageDialog(this, "Por favor, confira se digitou corretamente o filme que procura", "Filme Não Encontrado", JOptionPane.ERROR_MESSAGE);
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        int quantidadeTotal;
        int ingressoMeia = (Integer) spnQuantidadeMeia.getValue();
        int ingressoInteira = (Integer) spnQuantidadeInteira.getValue();
        int filmeSelecionadoaux = tblFilmes.getSelectedRow();
        quantidadeTotal = ingressoInteira + ingressoMeia;
        Filme filmeSelecionado = null;
        
        System.out.println(filmeSelecionadoaux);
        
        if(filmeSelecionadoaux == 0) filmeSelecionado = filme1;
        if(filmeSelecionadoaux == 1) filmeSelecionado = filme2;
        if(filmeSelecionadoaux == 2) filmeSelecionado = filme3;
        if(filmeSelecionadoaux == 3) filmeSelecionado = filme4;
        if(filmeSelecionadoaux == 4) filmeSelecionado = filme5;
        if(filmeSelecionadoaux == 5) filmeSelecionado = filme6;
        
        spnQuantidadeInteira.setValue(0);
        spnQuantidadeMeia.setValue(0);

        
        if(filmeSelecionadoaux == -1 || quantidadeTotal == 0){
            JOptionPane.showMessageDialog(this, "Por favor, selecione um Filme e uma quantidade de Ingressos", "Nenhum Filme Selecionado", JOptionPane.ERROR_MESSAGE);
        } else {
            //instância do ingresso
            Ticket ingresso = new Ticket(ingressoInteira, ingressoMeia, quantidadeTotal, filmeSelecionado);
            
            if(filmeSelecionadoaux == 0){
                telaInicial.telasAssento1.setVisible(true);
                //setVisible(false);
            }
            
            if(filmeSelecionadoaux == 1){
                telaInicial.telasAssento2.setVisible(true);
                //setVisible(false);
            }
            
            if(filmeSelecionadoaux == 2){
                telaInicial.telasAssento3.setVisible(true);
                //setVisible(false);
            }
            
            if(filmeSelecionadoaux == 3){
                telaInicial.telasAssento4.setVisible(true);
                //setVisible(false);
            }
            
            if(filmeSelecionadoaux == 4){
                telaInicial.telasAssento5.setVisible(true);
                //setVisible(false);
            }
            
            if(filmeSelecionadoaux == 5){
                telaInicial.telasAssento6.setVisible(true);
                //setVisible(false);
            }
        }
            
 
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        getTelaInicial().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        telaInicial.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Ingresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Ingresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Ingresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Ingresso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Ingresso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFilmes;
    private javax.swing.JLabel lblIngresso;
    private javax.swing.JLabel lblIngressoMeia;
    private javax.swing.JSpinner spnQuantidadeInteira;
    private javax.swing.JSpinner spnQuantidadeMeia;
    private javax.swing.JTable tblFilmes;
    private javax.swing.JTextField txtPesquisarFilme;
    // End of variables declaration//GEN-END:variables
}
