
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class TelaUsuario extends javax.swing.JFrame {
// será usado pela op do menu "Adicionar Usuario"

    public TelaUsuario() {
        initComponents();
        btnExcluir.setVisible(false);
        btnSalvarAlteracao.setVisible(false);
    }
// Será utilizado pela op do menu "Excluir Usuario"
    // ou Alterar dados do Usuário.
    //Recebera os dados dos usuarios e exibirá nos campos

    public TelaUsuario(String usuario, String senha, String nome, String cargo, String operacao) {
        initComponents();
        txtUsuario.setText(usuario);
        txtSenha.setText(senha);
        txtNome.setText(nome);
        cmbCargo.setSelectedItem(cargo);
        if (operacao.equals("Excluir")) {
            btnSalvar.setVisible(false);
            btnSalvarAlteracao.setVisible(false);
        } else if (operacao.equals("Alterar")) {
            btnSalvar.setVisible(false);
            btnExcluir.setVisible(false);
            txtUsuario.setEnabled(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvarAlteracao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Controle de usuários");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 102, 0));
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 30, 80, 30);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(160, 30, 190, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 102, 0));
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(70, 100, 80, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(160, 100, 190, 30);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 102, 0));
        lblNome.setText("Nome ");
        getContentPane().add(lblNome);
        lblNome.setBounds(70, 170, 80, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(160, 170, 290, 30);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 102, 0));
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(70, 310, 80, 30);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Diretor", "Compradora Orçamentária", "Programador", "DBA", "Diretor de TI" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(160, 310, 200, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 102, 0));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        btnSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(70, 400, 160, 50);

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 102, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(340, 400, 160, 50);

        btnSalvarAlteracao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalvarAlteracao.setForeground(new java.awt.Color(255, 102, 0));
        btnSalvarAlteracao.setText("Save Alteração");
        btnSalvarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracao);
        btnSalvarAlteracao.setBounds(590, 400, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String u, s, n, c;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (txtUsuario.equals(" ")) {
            JOptionPane.showMessageDialog(null, "É obrigatório preenchimento do campo");
            txtUsuario.requestFocus();
            return; //Stop

        }
        if (u.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            txtUsuario.requestFocus();
            return; // stop
        }

// 3 - Conectar com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //4 - Inserir dados coletados no formulario para o BD
            PreparedStatement st = conectado.prepareStatement("INSERT INTO usuario VALUES (?,?,?,?)");
            st.setString(1, u);
            st.setString(2, s);
            st.setString(3, n);
            st.setString(4, c);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso");
            // 4- Limpar os campos
            txtUsuario.setText(" ");
            txtSenha.setText(" ");
            txtNome.setText(" ");
            cmbCargo.setSelectedIndex(0);
            txtUsuario.requestFocus();

            //5 - Desconectar do BD
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Etre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvar.doClick();
        }
    }//GEN-LAST:event_btnSalvarKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //1 - Perguntar se tem certeza que deseja excluir
        int resposta; // 0 - Sim; 1 - Não 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        //1.1 - Se a responta for sim
        if (resposta == 0) { //Resposta SIM
            //1.1.1 Obter o usuário no txtUsuario.
            String u = txtUsuario.getText();
            //1.1.2 - Conectar com o banco de dados.
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
                //1.1.3 - Excluir o usuário do banco de dados.
                PreparedStatement st = conectado.prepareStatement("DELETE FROM usuario WHERE usuario = ?");
                st.setString(1, u);
                st.executeUpdate(); //INSERT, UPDATE, DELETE
                //1.1.4 Mostrar a mensagem "Usuário excluído com sucesso" e limpar os campos.
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
                //1.1.5 Fecha a TelaUsuario 
                dispose();
                //1.1.6 Desconectar do banco de dados
                conectado.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
            }
            //1.2 - Se a resposta for não
            //1.2.2 Fecha a TelaUsuario  
        } else {
            dispose();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracaoActionPerformed
        String u, s, n, c;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (txtUsuario.equals(" ")) {
            JOptionPane.showMessageDialog(null, "É obrigatório preenchimento do campo");
            txtUsuario.requestFocus();
            return; //Stop

        }
        if (u.isEmpty()) { // se usuário está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o usuário");
            txtUsuario.requestFocus();
            return; // stop
        }

// 3 - Conectar com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //4 - Inserir dados coletados no formulario para o BD
            PreparedStatement st = conectado.prepareStatement("UPDATE usuario SET senha = ?, nome = ?, cargo = ? WHERE usuario = ?");
            st.setString(1, s);
            st.setString(2, n);
            st.setString(3, c);
            st.setString(4, u);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            //Limpar os campos

            //5 - Desconectar do BD
            conectado.close();
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro" + ex.getMessage());
        }

    }//GEN-LAST:event_btnSalvarAlteracaoActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvarAlteracao;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
