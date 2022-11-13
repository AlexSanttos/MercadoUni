

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DadosContratuais extends javax.swing.JFrame {

public DadosContratuais(String emp,String cnpj,String ce,String valor,String cd) {
    initComponents();
    txtEmpresa.setText(emp);
    txtCnpj.setText (cnpj);
    txtContratoExpira.setText (ce);
    txtValorContrato.setText (valor);
    txtContratoDestinado.setText (cd);
}
    public DadosContratuais() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtContratoExpira = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtValorContrato = new javax.swing.JTextField();
        cmbPago = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbConta = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtContratoDestinado = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpresa);
        txtEmpresa.setBounds(93, 30, 325, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Empresa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 80, 41);

        txtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjActionPerformed(evt);
            }
        });
        getContentPane().add(txtCnpj);
        txtCnpj.setBounds(93, 109, 325, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("CNPJ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 119, 63, 20);
        getContentPane().add(txtContratoExpira);
        txtContratoExpira.setBounds(20, 209, 325, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Contrato expira em:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 173, 135, 20);

        txtValorContrato.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        txtValorContrato.setForeground(new java.awt.Color(0, 102, 0));
        txtValorContrato.setToolTipText("");
        txtValorContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorContratoActionPerformed(evt);
            }
        });
        getContentPane().add(txtValorContrato);
        txtValorContrato.setBounds(575, 64, 403, 72);

        cmbPago.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cmbPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A Vista", "1X", "2X", "3X", "4X", "5X", "6X", "7X", "8X", "9X", "10X", "11X", "12X", "13X", "14X", "15X", "16X", "17X", "18X", "19X", "20X", "21X", "22X", "23X", "24X", "25X", "26X", "27X", "28X", "29X", "30X", "31X", "32X", "33X", "34X", "35X", "36X", "37X", "38X", "39X", "40X", "41X", "42X", "43X", "44X", "45X", "46X", "47X", "48X" }));
        cmbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPagoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPago);
        cmbPago.setBounds(662, 209, 124, 42);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Pago em:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(576, 219, 80, 18);

        cmbConta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cmbConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Itaú Unibanco", "Banco do Brasil", "Bnaco Safra", "Banco Santander", "Mercado Pago", " " }));
        cmbConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbContaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbConta);
        cmbConta.setBounds(576, 379, 247, 28);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("Conta Corrente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(576, 333, 90, 18);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("Valor do Contrato");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(575, 30, 160, 18);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("Contrato destinado para");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 303, 260, 18);
        getContentPane().add(txtContratoDestinado);
        txtContratoDestinado.setBounds(20, 333, 398, 150);

        btnSalvar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 51, 0));
        btnSalvar.setText("ALTERAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(640, 460, 330, 50);

        setSize(new java.awt.Dimension(1035, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnpjActionPerformed

    private void cmbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPagoActionPerformed

    private void txtValorContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorContratoActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String a,u,b,n,x;
        a = cmbConta.getSelectedItem().toString();
        u = txtValorContrato.getText();
        b = cmbPago.getSelectedItem().toString();
        x = txtContratoDestinado.getText();
        n = txtEmpresa.getText();
        
        
                try {
                BD financasBD = new BD();
               financasBD.selecionarConta (a,u,b,x,n);
               JOptionPane.showMessageDialog(null, "Alteração Realizada com Sucesso ");
            
       } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
               } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cmbContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbContaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbConta;
    private javax.swing.JComboBox<String> cmbPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtContratoDestinado;
    private javax.swing.JTextField txtContratoExpira;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtValorContrato;
    // End of variables declaration//GEN-END:variables
}
