package br.edu.com.uricer.view;

import br.edu.com.uricer.dao.PessoaDAO;
import br.edu.com.uricer.model.Pessoa;
import br.edu.com.uricer.p2.DataBase;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PessoaFrom extends javax.swing.JFrame {
    
    public PessoaFrom() {
        
        initComponents();
        inicializar();
    }
    private void inicializar(){
        try {
            pessoaDAO = new PessoaDAO(DataBase.getConnection());
        } catch (SQLException ex) {
            Logger.getLogger(PessoaFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        PainelCadastro = new javax.swing.JTabbedPane();
        PainelPesquisar = new javax.swing.JPanel();
        LabelPesquisar = new javax.swing.JLabel();
        CampoPesquisar = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        painelDeRolagem = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nomeId = new javax.swing.JLabel();
        valorId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        btNovo = new javax.swing.JButton();
        btCriar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelCadastro.setToolTipText("");

        LabelPesquisar.setText("Pesquisar:");

        CampoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesquisarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        painelDeRolagem.setViewportView(jTable1);

        javax.swing.GroupLayout PainelPesquisarLayout = new javax.swing.GroupLayout(PainelPesquisar);
        PainelPesquisar.setLayout(PainelPesquisarLayout);
        PainelPesquisarLayout.setHorizontalGroup(
            PainelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btPesquisar)
                .addContainerGap(121, Short.MAX_VALUE))
            .addComponent(painelDeRolagem)
        );
        PainelPesquisarLayout.setVerticalGroup(
            PainelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPesquisarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PainelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PainelCadastro.addTab("Pesquisar", PainelPesquisar);

        nomeId.setText("ID: ");

        valorId.setEnabled(false);

        jLabel1.setText("Nome:");

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btCriar.setText("Criar");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeId)
                        .addGap(16, 16, 16)
                        .addComponent(valorId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addGap(18, 18, 18)
                                .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar)
                                .addGap(22, 22, 22)
                                .addComponent(btExcluir))
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btCriar)
                    .addComponent(btCancelar)
                    .addComponent(btExcluir))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        PainelCadastro.addTab("Cadastro", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastro)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelCadastro)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesquisarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        pessoa = new Pessoa();
        limparEdits();
        campoNome.grabFocus();
        
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        editParaPessoa();
        try {
            if(pessoa.getId() == null || pessoa.getId() == 0) {
                Integer id = pessoaDAO.create(pessoa);
                pessoa.setId(id);
                valorId.setText(id.toString());

            } else {
                pessoaDAO.update(pessoa);
            }
            JOptionPane.showMessageDialog(this, "Dados gravados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaFrom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao gravar pessoa", "Erro", JOptionPane.ERROR);
        }
        
    }//GEN-LAST:event_btCriarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed
    private void editParaPessoa() {
        if(valorId.getText() != null && !valorId.getText().isEmpty()) {
            pessoa.setId(Integer.parseInt(valorId.getText()));
        }

        pessoa.setNome(campoNome.getText());
    }
    private void limparEdits(){
        valorId.setText("");
        campoNome.setText("");
    }
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PessoaFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JLabel LabelPesquisar;
    private javax.swing.JTabbedPane PainelCadastro;
    private javax.swing.JPanel PainelPesquisar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nomeId;
    private javax.swing.JScrollPane painelDeRolagem;
    private javax.swing.JTextField valorId;
    // End of variables declaration//GEN-END:variables
    private Pessoa pessoa;
    private PessoaDAO pessoaDAO;

   
}