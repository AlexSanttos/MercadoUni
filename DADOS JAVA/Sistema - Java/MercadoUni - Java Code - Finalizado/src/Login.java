// classe necessária para guardar a conexão estabelecida com o banco de dados
import java.sql.Connection; 
// classe necessária para informar os parâmetros de conexão com o banco de dados
import java.sql.DriverManager;
// classe necessária para informar o que fazer se alguma informação d banco de dados estiver incorreta no código
import java.sql.SQLException;
//classe necessária para execução de comandos SQL (INSERT, UPDATE, DELETE, SELECT)
import java.sql.PreparedStatement;
// classe necessária para armazenar o que é trazido da tabela pelo comando SELECT
import java.sql.ResultSet;
// classe necessária para mostrar mensagens em janlinhas pop-up

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Acesso ao sistema");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 102, 0));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(230, 110, 120, 30);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(370, 110, 170, 40);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 102, 0));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(230, 180, 110, 40);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(370, 180, 170, 40);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(280, 300, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(811, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        try {
            String usuario, senha;
            usuario = txtUsuario.getText();
            senha = txtSenha.getText();
            // 2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd","root","Skyline2");
            //3 - Buscar o usuario digitado na tabela usuario do banco de dados
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
            st.setString(1, usuario);
            st.setString(2, senha);
            ResultSet  resultado =  st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if(resultado.next()){
                String nome;
               String cargo;
               nome = resultado.getString("nome");
               cargo = resultado.getString("cargo");
               
               
                //Abrir o formulário Menu.java
                Menu tela;
                tela = new Menu(nome, cargo);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos");
            }     // 5 - Desconectar
            conectado.close();
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog (null, "Driver não está na biblioteca");
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog (null, "Você nos parâmetros (Dados) da conexão com o BD");
        }
        
                    
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        btnEntrar.doClick();
    }//GEN-LAST:event_btnEntrarKeyPressed

   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
