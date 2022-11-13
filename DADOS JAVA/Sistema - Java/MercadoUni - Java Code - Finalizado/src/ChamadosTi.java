import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ChamadosTi extends javax.swing.JFrame {

    
    public ChamadosTi() {
        initComponents();
    }
 public ChamadosTi(String data, String nome, String cargo, String descricao) {
        initComponents();
        txtNome.setText(nome);
        txtData.setText(data);
        txtDescricao.setText(descricao);
        cmbCargo.setSelectedItem(cargo);
        btnEnviar.setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbnNome = new javax.swing.JLabel();
        lbnCargo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lbnDescricao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        lbnNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbnNome.setForeground(new java.awt.Color(255, 51, 0));
        lbnNome.setText("Nome:");
        getContentPane().add(lbnNome);
        lbnNome.setBounds(107, 44, 50, 30);

        lbnCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbnCargo.setForeground(new java.awt.Color(255, 51, 0));
        lbnCargo.setText("Cargo:");
        getContentPane().add(lbnCargo);
        lbnCargo.setBounds(107, 84, 70, 30);

        lblData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(255, 51, 0));
        lblData.setText("Data do ocorrido:");
        getContentPane().add(lblData);
        lblData.setBounds(77, 124, 100, 30);

        lbnDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbnDescricao.setForeground(new java.awt.Color(255, 51, 0));
        lbnDescricao.setText("Descrição do problema:");
        getContentPane().add(lbnDescricao);
        lbnDescricao.setBounds(50, 230, 150, 16);

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(177, 44, 140, 30);

        txtData.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtData);
        txtData.setBounds(177, 124, 140, 30);

        txtDescricao.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(txtDescricao);
        txtDescricao.setBounds(100, 250, 370, 80);

        btnEnviar.setBackground(new java.awt.Color(204, 204, 204));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 51, 0));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(100, 380, 72, 26);

        cmbCargo.setBackground(new java.awt.Color(204, 204, 204));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Analista", "Estagiário", "Vendedor", "Programador", "Segurança", "Professor" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        cmbCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCargoKeyPressed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(177, 84, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 440);

        setSize(new java.awt.Dimension(784, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        //1 - Pegar as informações dos campos do formulário.
        String n, d, a, c;
        n = txtNome.getText();
        d = cmbCargo.getSelectedItem().toString();
        a = txtData.getText();
        c = txtDescricao.getText();
        //2 - Verificar se os campos txtUsuario e txtSenha do formulário, não estão vazios.
        if (n.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o nome");
            txtNome.requestFocus();
            return; // stop
        }
        if (d.isEmpty()) { // se senha está vazia
            JOptionPane.showMessageDialog(null, "É obrigatório digitar a data");
            txtData.requestFocus();
            return; // stop
        }
        //3 - Conectar com o banco de dados.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamadosti", "root", "Skyline2");
            //4 - Inserir os dados digitados, na tabela do banco de dados.
            PreparedStatement st = conectado.prepareStatement("INSERT INTO chamados VALUES(?,?,?,?)");
            st.setString(1, n);
            st.setString(2, d);
            st.setString(3, a);
            st.setString(4, c);
            st.executeUpdate();
            //4.1 Mostrar a mensagem "Usuário salvo com sucesso" e limpar os campos.
            JOptionPane.showMessageDialog(null, " Relatorio enviado com sucesso");
            txtNome.setText("");
            txtData.setText("");
            txtDescricao.setText("");
            cmbCargo.setSelectedIndex(0);
            txtNome.requestFocus();
            //5.0 Desconectar do banco de dados
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtNome.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "ENtre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void cmbCargoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCargoKeyPressed

    }//GEN-LAST:event_cmbCargoKeyPressed

   
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
            java.util.logging.Logger.getLogger(ChamadosTi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChamadosTi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChamadosTi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChamadosTi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamadosTi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lbnCargo;
    private javax.swing.JLabel lbnDescricao;
    private javax.swing.JLabel lbnNome;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
