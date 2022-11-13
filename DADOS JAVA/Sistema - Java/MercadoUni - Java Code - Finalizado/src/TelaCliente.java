import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Jm.JMascara;


public class TelaCliente extends javax.swing.JFrame {

   
    public TelaCliente() {
        initComponents();
        btnExcluir.setVisible(false);
        btnSalvarAlteracao.setVisible(false);
    }

    public TelaCliente(String NomeCliente, String CNPJ, String Nome,String Telefone,String operacao) {
        initComponents();
        txtNomeCliente.setText(NomeCliente);
        txtCnpj.setText(CNPJ);
        txtNomeResponsavel.setText(Nome);
        txtTelefone.setText(Telefone);
         
        if (operacao.equals("excluir")) {
            btnSalvar.setVisible(false);
            btnSalvarAlteracao.setVisible(false);
        } else if (operacao.equals("alterar")) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
        }

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        lblCnpj = new javax.swing.JLabel();
        lblNomeResponsavel = new javax.swing.JLabel();
        txtNomeResponsavel = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvarAlteracao = new javax.swing.JButton();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(255, 51, 0));
        lblNomeCliente.setText("Nome do Cliente :");
        getContentPane().add(lblNomeCliente);
        lblNomeCliente.setBounds(67, 52, 130, 40);

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeCliente);
        txtNomeCliente.setBounds(235, 58, 180, 30);

        txtCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnpjActionPerformed(evt);
            }
        });
        txtCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCnpjKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCnpjKeyReleased(evt);
            }
        });
        getContentPane().add(txtCnpj);
        txtCnpj.setBounds(235, 116, 180, 30);

        lblCnpj.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCnpj.setForeground(new java.awt.Color(255, 51, 0));
        lblCnpj.setText("CNPJ do Cliente :");
        getContentPane().add(lblCnpj);
        lblCnpj.setBounds(67, 110, 120, 40);

        lblNomeResponsavel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNomeResponsavel.setForeground(new java.awt.Color(255, 51, 0));
        lblNomeResponsavel.setText("Nome do Responsálvel:");
        getContentPane().add(lblNomeResponsavel);
        lblNomeResponsavel.setBounds(67, 168, 150, 40);

        txtNomeResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeResponsavelActionPerformed(evt);
            }
        });
        txtNomeResponsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeResponsavelKeyPressed(evt);
            }
        });
        getContentPane().add(txtNomeResponsavel);
        txtNomeResponsavel.setBounds(235, 174, 180, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 51, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(107, 359, 110, 30);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 51, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(335, 359, 80, 30);

        btnSalvarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvarAlteracao.setForeground(new java.awt.Color(255, 51, 0));
        btnSalvarAlteracao.setText("Salvar Alteração");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracao);
        btnSalvarAlteracao.setBounds(499, 359, 130, 30);

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyReleased(evt);
            }
        });
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(240, 280, 180, 30);

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 51, 0));
        lblTelefone.setText("Telefone:");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(110, 270, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 490);

        setSize(new java.awt.Dimension(706, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeClienteActionPerformed

    private void txtNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyPressed

    }//GEN-LAST:event_txtNomeClienteKeyPressed

    private void txtCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnpjActionPerformed
        txtCnpj.setText(JMascara.GetJmascaraCpfCnpj(txtCnpj.getText()));
    }//GEN-LAST:event_txtCnpjActionPerformed

    private void txtCnpjKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnpjKeyPressed

    private void txtCnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCnpjKeyReleased
        txtCnpj.setText(JMascara.GetJmascaraCpfCnpj(txtCnpj.getText()));
    }//GEN-LAST:event_txtCnpjKeyReleased

    private void txtNomeResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeResponsavelActionPerformed

    private void txtNomeResponsavelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeResponsavelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeResponsavelKeyPressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String Nome_cli,cnpj,nomeResponsavel,telefone;

        Nome_cli = txtNomeCliente.getText();
        cnpj = txtCnpj.getText();
        nomeResponsavel = txtNomeResponsavel.getText();
        telefone = txtTelefone.getText();

        //2 - Verificar se os campos txtUsuario e txtSenha do formulário, não estão vazios.
        if (Nome_cli.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório o nome do Cliente");
            txtNomeCliente.requestFocus();
            return; // stop
        }
        if (cnpj.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório informar o CNPJ");
            txtCnpj.requestFocus();
            return; // stop
        }
        //3 - Conectar com o banco de dados.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadouni", "root", "Skyline2");
            //4 - Inserir os dados digitados, na tabela do banco de dados.
            PreparedStatement st = conectado.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?)");

            st.setString(1, Nome_cli);
            st.setString(2, cnpj);
            st.setString(3, nomeResponsavel);
            st.setString(4, telefone);
            st.executeUpdate();
            //4.1 Mostrar a mensagem "Usuário salvo com sucesso" e limpar os campos.
            JOptionPane.showMessageDialog(null, "Contrato cadastrado com sucesso!");
            txtNomeCliente.setText("");
            txtCnpj.setText("");
            txtNomeResponsavel.setText("");
            txtTelefone.setText("");

            txtNomeCliente.requestFocus();
            //5.0 Desconectar do banco de dados
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");

            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage() + "\nCódigo do erro:" + ex.getErrorCode());
            } else {
                JOptionPane.showMessageDialog(null, "Etre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta; // 0 - Sim; 1- Não; 2 - Cancelar
        resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir esse Contrato?", "Confirmação", 0);
        //  1.1 - Se a responta for sim
        if (resposta == 0) {

            //1.1.1 Obter o usuário no txtUsuario.
            String NomeCli = txtNomeCliente.getText();

            // 1.1.2 Conectar com o banco de dados
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadouni", "root", "admin");
                //4 - Exluir usuáriovdo banco de dados.
                PreparedStatement st = conectado.prepareStatement("DELETE FROM cliente  WHERE Contrato=?");

                st.setString(1, NomeCli);
                st.executeUpdate();
                //4.1 Mostrar a mensagem "Usuário salvo com sucesso" e limpar os campos.
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!!");
                dispose();
                //1.1.5 Desconectar do banco de dados
                conectado.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }
        } else { // Resposta for Não
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        //1 - Pegar as informações dos campos do formulário.
        String NomeCli, cnpj, nomeRespo, telefone;
        NomeCli = txtNomeCliente.getText();
        cnpj = txtCnpj.getText();
        nomeRespo = txtNomeResponsavel.getText();
        telefone = txtTelefone.getText();

        //2 - Verificar se os campos txtUsuario e txtSenha do formulário, não estão vazios.
        if (NomeCli.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            txtNomeCliente.requestFocus();
            return; // stop
        }
        if (cnpj.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a senha");
            txtCnpj.requestFocus();
            return; // stop
        }
        //3 - Conectar com o banco de dados.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadouni", "root", "admin");
            //4 - Inserir os dados digitados, na tabela do banco de dados.
            PreparedStatement st = conectado.prepareStatement("UPDATE cliente SET CNPJ = ?, Nome = ? , Telefone =  ? WHERE Contrato = ?");

            st.setString(1, cnpj);
            st.setString(2,nomeRespo);
            st.setString(3,telefone);
            st.setString(4,NomeCli);
            st.executeUpdate();
            //4.1 Mostrar a mensagem "Usuário salvo com sucesso" e limpar os campos.
            JOptionPane.showMessageDialog(null, "Contrato alterado com sucesso!");
            //5.0 Desconectar do banco de dados
            conectado.close();
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        txtTelefone.setText(JMascara.GetJmascaraFone(txtTelefone.getText()));
    }//GEN-LAST:event_txtTelefoneActionPerformed

    
    
    private void txtTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyReleased
        txtTelefone.setText(JMascara.GetJmascaraFone(txtTelefone.getText()));
    }//GEN-LAST:event_txtTelefoneKeyReleased

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCnpj;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeResponsavel;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeResponsavel;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
