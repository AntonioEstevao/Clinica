/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloDao.DaoMedico;
import modeloBeans.BeansMedico;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;

public class FormMedico extends javax.swing.JFrame {
     BeansMedico mod = new BeansMedico () ;
     DaoMedico control = new DaoMedico();
     ConexaoBD conex = new ConexaoBD( );
     int flag = 0;
    
     public FormMedico(){
        
         initComponents();
         prencherTabela ("select * from medicos order by nome_med");
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCrm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxEspe = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedico = new javax.swing.JTable();
        btnPesq = new javax.swing.JButton();
        txtPesq = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setEnabled(false);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome :");

        txtNome.setEnabled(false);

        txtCrm.setEnabled(false);
        txtCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrmActionPerformed(evt);
            }
        });

        jLabel3.setText("Crm :");

        jLabel4.setText("Especialista :");

        jComboBoxEspe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cirugião", "Pediatra", "Item 3", "Item 4" }));
        jComboBoxEspe.setEnabled(false);
        jComboBoxEspe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEspeActionPerformed(evt);
            }
        });

        tblMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedico);

        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });

        jLabel5.setText("Id :");

        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesq)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 52, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxEspe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnPesq)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxEspe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnSalvar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesq)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE MÉDICOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1852, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(728, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtNome.setEnabled(true);
        jComboBoxEspe.setEnabled(true);
        txtCrm.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtPesq.setEnabled(true);
        btnPesq.setEnabled(true);
        txtId.setText("");
        txtNome.setText("");
        txtCrm.setText("");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCrmActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
         txtNome.setEnabled(true);
        jComboBoxEspe.setEnabled(true);
        txtCrm.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jComboBoxEspeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEspeActionPerformed
        
    }//GEN-LAST:event_jComboBoxEspeActionPerformed

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
       
    }//GEN-LAST:event_txtPesqActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if (txtNome.getText().isEmpty()){
        JOptionPane.showMessageDialog(null," Preencha o NOME para continua ");
          txtNome.requestFocus();
          }else if (txtCrm.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null," Preencha o CRM para continua ");
          txtCrm.requestFocus();
          } else
       
        if ( flag == 1){
        mod.setNome(txtNome.getText());
        mod.setEspecialidade((String)jComboBoxEspe.getSelectedItem());
        mod.setCrm(Integer.parseInt(txtCrm.getText()));
        control.Salvar(mod);
        txtNome.setText("");
        txtCrm.setText("");
        txtNome.setEnabled(false);
        jComboBoxEspe.setEnabled(false);
        txtCrm.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        prencherTabela ("select * from medicos order by nome_med");
        } else {
        mod.setCodigo(Integer.parseInt(txtId.getText()));
        mod.setNome(txtNome.getText());
        mod.setEspecialidade((String)(jComboBoxEspe.getSelectedItem()));
        mod.setCrm(Integer.parseInt(txtCrm.getText()));
       control.Editar(mod);
        txtId.setText("");
        txtNome.setText("");
        txtCrm.setText("");
        txtNome.setEnabled(false);
        jComboBoxEspe.setEnabled(false);
        txtCrm.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        prencherTabela ("select * from medicos order by nome_med");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        flag = 1;
        txtNome.setEnabled(true);
        jComboBoxEspe.setEnabled(true);
        txtCrm.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtId.setText("");
        txtNome.setText("");
        txtCrm.setText("");
        txtPesq.setText("");
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtPesq.setEnabled(false);
        btnPesq.setEnabled(false);
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        mod.setPesquisa(txtPesq.getText());
        BeansMedico model = control.buscaMedico (mod);
        txtNome.setText(model.getNome());
        txtId.setText(Integer.toString(model.getCodigo()));
        txtCrm.setText(Integer.toString(model.getCrm()));
        jComboBoxEspe.setSelectedItem(model.getEspecialidade());
        prencherTabela (" select * from medicos where nome_med like '%"+ mod.getPesquisa()+"%'");
        
        
        
        
    }//GEN-LAST:event_btnPesqActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, " Deseja realmente excluir ?");
        if (resposta == JOptionPane.YES_OPTION) {
        mod.setCodigo(Integer.parseInt(txtId.getText()));
        control.Excluir(mod);
        txtId.setText("");
        txtNome.setText("");
        txtCrm.setText("");
        txtNome.setEnabled(false);
        jComboBoxEspe.setEnabled(false);
        txtCrm.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        prencherTabela ("select * from medicos order by nome_med");
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicoMouseClicked
        // TODO add your handling code here:
        String nome_med = "" +tblMedico.getValueAt(tblMedico.getSelectedRow(), 1);
         conex.conexao();
         conex.executaSql(" select * from medicos where nome_med='"+nome_med+"'");
         try {
             conex.rs.first();
             txtId.setText(String.valueOf(conex.rs.getInt("cod_med")));
             txtNome.setText(conex.rs.getString("nome_med"));
             jComboBoxEspe.setSelectedItem(conex.rs.getString("especialidade_med"));
             txtCrm.setText(conex.rs.getString("crm"));
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane," Erro ao selecionar dados "+ex);
         }
         btnEditar.setEnabled(true);
         btnExcluir.setEnabled(true);
         btnCancelar.setEnabled(true);
    }//GEN-LAST:event_tblMedicoMouseClicked
    public void prencherTabela (String Sql) {
       ArrayList dados = new ArrayList();
       String [] colunas = new String [] {"cod_med","nome_med", "especialidade_med", "crm",};  
       conex.conexao();
       conex.executaSql(Sql);
       
       try {
           conex.rs.first();
           do {
             dados.add(new Object []{ conex.rs.getInt("cod_med"),conex.rs.getString("nome_med"), conex.rs.getString("especialidade_med"), conex.rs.getInt("crm")} );
           }while (conex.rs.next());
       }catch(SQLException ex){
       JOptionPane.showMessageDialog(rootPane," Pesquisa outro medico");
       }
       ModeloTabela modelo = new ModeloTabela (dados, colunas);
       tblMedico.setModel (modelo);
       tblMedico.getColumnModel().getColumn(0).setPreferredWidth(23);
       tblMedico.getColumnModel().getColumn(0).setResizable(false);
        tblMedico.getColumnModel().getColumn(1).setPreferredWidth(180);
       tblMedico.getColumnModel().getColumn(1).setResizable(false);
        tblMedico.getColumnModel().getColumn(2).setPreferredWidth(80);
       tblMedico.getColumnModel().getColumn(2).setResizable(false);
        tblMedico.getColumnModel().getColumn(3).setPreferredWidth(80);
       tblMedico.getColumnModel().getColumn(3).setResizable(false);
       tblMedico.getTableHeader().setReorderingAllowed(false);
       tblMedico.setAutoResizeMode(tblMedico.AUTO_RESIZE_OFF);
       tblMedico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   }  
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
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox jComboBoxEspe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblMedico;
    private javax.swing.JTextField txtCrm;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
