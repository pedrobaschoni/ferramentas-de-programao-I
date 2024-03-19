package br.edu.ifsp.pep.visao;

import br.edu.ifsp.pep.dao.TipoVeiculoDAO;
import br.edu.ifsp.pep.modelo.TipoVeiculo;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class TipoVeiculoView extends javax.swing.JDialog {

    private TipoVeiculoDAO tipoVeiculoDAO = new TipoVeiculoDAO();
    private List<TipoVeiculo> tiposVeiculos;
    private TipoVeiculo tipoVeiculo; //Utilizado para inserir ou alterar

    /**
     * Creates new form TipoVeiculoView
     */
    public TipoVeiculoView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setEnabledCampoTexto(false);
        this.setEnabledBotoes(true);
    }

    private void setEnabledBotoes(boolean enabled) {
        bInserir.setEnabled(enabled);
        bAlterar.setEnabled(enabled);
        bExcluir.setEnabled(enabled);
        bPesquisar.setEnabled(enabled);

        bGravar.setEnabled(!enabled);
        bCancelar.setEnabled(!enabled);
    }

    private void setEnabledCampoTexto(boolean enabled) {
        tfNome.setEnabled(enabled);
        tfValorDiaria.setEnabled(enabled);
        tfPesquisa.setEnabled(!enabled);
        jTabela.setEnabled(!enabled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pGeral = new javax.swing.JPanel();
        lTitulo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lValorDiaria = new javax.swing.JLabel();
        tfValorDiaria = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        pBotoes = new javax.swing.JPanel();
        bInserir = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bGravar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pGeral.setBackground(new java.awt.Color(255, 255, 255));

        lTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(0, 51, 153));
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Tipos de Veículo");

        lNome.setText("Nome:");

        lValorDiaria.setText("Valor da diária:");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor da diária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabela.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTabela);
        if (jTabela.getColumnModel().getColumnCount() > 0) {
            jTabela.getColumnModel().getColumn(0).setResizable(false);
            jTabela.getColumnModel().getColumn(1).setResizable(false);
            jTabela.getColumnModel().getColumn(2).setResizable(false);
        }

        pBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bInserir.setText("Inserir");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bAlterar.setText("Alterar");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bExcluir.setText("Excluir");
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bGravar.setText("Gravar");
        bGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGravarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBotoesLayout = new javax.swing.GroupLayout(pBotoes);
        pBotoes.setLayout(pBotoesLayout);
        pBotoesLayout.setHorizontalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBotoesLayout.setVerticalGroup(
            pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInserir)
                    .addComponent(bAlterar)
                    .addComponent(bExcluir)
                    .addComponent(bGravar)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        jLabel1.setText("Nome");

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pGeralLayout = new javax.swing.GroupLayout(pGeral);
        pGeral.setLayout(pGeralLayout);
        pGeralLayout.setHorizontalGroup(
            pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pGeralLayout.createSequentialGroup()
                        .addComponent(lNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))
                    .addComponent(pBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(pGeralLayout.createSequentialGroup()
                        .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pGeralLayout.createSequentialGroup()
                                .addComponent(lValorDiaria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pGeralLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pGeralLayout.setVerticalGroup(
            pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lNome, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(tfNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed

        this.setEnabledCampoTexto(true);
        this.setEnabledBotoes(false);

        tfNome.requestFocus();


    }//GEN-LAST:event_bInserirActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed

        if (jTabela.getSelectedRow() >= 0) {

            this.setEnabledCampoTexto(true);
            this.setEnabledBotoes(false);

            //Carregar os dados para os campos de texto
            tipoVeiculo = this.tiposVeiculos.get(jTabela.getSelectedRow());
            tfNome.setText(tipoVeiculo.getNome());
            tfValorDiaria.setText(tipoVeiculo.getValorDiaria().toString());

            tfNome.requestFocus();
        } else
            JOptionPane.showMessageDialog(null,
                    "Selecione um Tipo de Veículo.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGravarActionPerformed

        //inserindo
        String txtNome = tfNome.getText();
        if (txtNome.length() > 3) {

            BigDecimal valorDiaria = new BigDecimal(tfValorDiaria.getText());
            String mensagem = "Tipo de Veículo cadastrado.";
            //adicionando
            if (tipoVeiculo == null) {
                tipoVeiculo = new TipoVeiculo(txtNome, valorDiaria);

            } //alteracao
            else {
                tipoVeiculo.setNome(txtNome);
                tipoVeiculo.setValorDiaria(valorDiaria);
                mensagem = "Tipo de Veículo alterado.";
            }

            try {
                tipoVeiculoDAO.alterar(tipoVeiculo);

                JOptionPane.showMessageDialog(null, mensagem);

                tfNome.setText("");
                tfValorDiaria.setText("");
                
                bPesquisarActionPerformed(evt);
                
                tipoVeiculo = null;
                
                this.setEnabledBotoes(true);
                this.setEnabledCampoTexto(false);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Informe pelo menos 4 caracteres no campo Nome.",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_bGravarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed

        tiposVeiculos = tipoVeiculoDAO.findByNome(tfPesquisa.getText());
        this.atualizarTabela();


    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed

        if (jTabela.getSelectedRow() >= 0) {

            TipoVeiculo tipoVeiculoSelecionado = this.tiposVeiculos
                    .get(jTabela.getSelectedRow());
            try {
                tipoVeiculoDAO.remover(tipoVeiculoSelecionado);
                JOptionPane.showMessageDialog(null,
                        "Tipo de Veículo selecionado foi excluído.");
                this.bPesquisarActionPerformed(evt);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "O Tipo de Veículo selecionado não pode ser excluído porque existe um Veículo relacionado.",
                        "Alerta", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione um Tipo de Veículo.",
                    "Alerta", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_bExcluirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed

        tfNome.setText("");
        tfValorDiaria.setText("");

        this.setEnabledCampoTexto(false);
        this.setEnabledBotoes(true);

    }//GEN-LAST:event_bCancelarActionPerformed

    private void atualizarTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTabela.getModel();
        modelo.setNumRows(0);
        for (TipoVeiculo tipoVeiculo : tiposVeiculos) {
            modelo.addRow(new Object[]{tipoVeiculo.getId(),
                tipoVeiculo.getNome(), tipoVeiculo.getValorDiaria()});
        }

    }

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
            java.util.logging.Logger.getLogger(TipoVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TipoVeiculoView dialog = new TipoVeiculoView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bGravar;
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lValorDiaria;
    private javax.swing.JPanel pBotoes;
    private javax.swing.JPanel pGeral;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfValorDiaria;
    // End of variables declaration//GEN-END:variables
}