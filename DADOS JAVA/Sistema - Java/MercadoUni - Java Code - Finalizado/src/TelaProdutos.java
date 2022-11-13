
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaProdutos extends javax.swing.JFrame {

    public TelaProdutos() {
        initComponents();
    }

    public TelaProdutos (String codigoproduto, String descricaoproduto , String qtde , String precounitario , String precovenda) {
        initComponents();
        txtcodigoProduto.setText(codigoproduto);
        txtdescricaoProduto.setText(descricaoproduto);
        txtqtde.setText(qtde);
        txtprecoUnitario.setText(precounitario);
        txtprecoVenda.setText(precovenda);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcodigoProduto = new javax.swing.JLabel();
        txtcodigoProduto = new javax.swing.JTextField();
        lbldescricaoProduto = new javax.swing.JLabel();
        txtdescricaoProduto = new javax.swing.JTextField();
        lblqtde = new javax.swing.JLabel();
        txtqtde = new javax.swing.JTextField();
        lblprecoUnitario = new javax.swing.JLabel();
        txtprecoUnitario = new javax.swing.JTextField();
        lblprecoVenda = new javax.swing.JLabel();
        txtprecoVenda = new javax.swing.JTextField();
        btndeletar = new javax.swing.JButton();
        btncadastrar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("TelaProdutos");
        getContentPane().setLayout(null);

        lblcodigoProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblcodigoProduto.setForeground(new java.awt.Color(255, 102, 0));
        lblcodigoProduto.setText("CÓDIGO PRODUTO");
        getContentPane().add(lblcodigoProduto);
        lblcodigoProduto.setBounds(30, 50, 170, 40);
        getContentPane().add(txtcodigoProduto);
        txtcodigoProduto.setBounds(210, 50, 190, 40);

        lbldescricaoProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbldescricaoProduto.setForeground(new java.awt.Color(255, 102, 0));
        lbldescricaoProduto.setText("Descrição do Produto");
        getContentPane().add(lbldescricaoProduto);
        lbldescricaoProduto.setBounds(40, 150, 180, 16);
        getContentPane().add(txtdescricaoProduto);
        txtdescricaoProduto.setBounds(40, 170, 660, 50);

        lblqtde.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblqtde.setForeground(new java.awt.Color(255, 102, 0));
        lblqtde.setText("Qtde");
        getContentPane().add(lblqtde);
        lblqtde.setBounds(50, 270, 50, 20);
        getContentPane().add(txtqtde);
        txtqtde.setBounds(50, 290, 64, 40);

        lblprecoUnitario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblprecoUnitario.setForeground(new java.awt.Color(255, 102, 0));
        lblprecoUnitario.setText("Preço Unitário");
        getContentPane().add(lblprecoUnitario);
        lblprecoUnitario.setBounds(160, 270, 80, 16);
        getContentPane().add(txtprecoUnitario);
        txtprecoUnitario.setBounds(160, 290, 260, 40);

        lblprecoVenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblprecoVenda.setForeground(new java.awt.Color(255, 102, 0));
        lblprecoVenda.setText("Preço de Venda");
        getContentPane().add(lblprecoVenda);
        lblprecoVenda.setBounds(500, 270, 90, 16);
        getContentPane().add(txtprecoVenda);
        txtprecoVenda.setBounds(500, 290, 200, 40);

        btndeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndeletar.setForeground(new java.awt.Color(255, 102, 0));
        btndeletar.setText("DELETAR");
        btndeletar.setPreferredSize(new java.awt.Dimension(82, 31));
        btndeletar.setRequestFocusEnabled(false);
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btndeletar);
        btndeletar.setBounds(620, 400, 130, 50);

        btncadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncadastrar.setForeground(new java.awt.Color(255, 102, 0));
        btncadastrar.setText("CADASTRAR");
        btncadastrar.setPreferredSize(new java.awt.Dimension(82, 31));
        btncadastrar.setRequestFocusEnabled(false);
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncadastrar);
        btncadastrar.setBounds(60, 400, 130, 50);

        btnconsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 102, 0));
        btnconsultar.setText("CONSULTAR");
        btnconsultar.setPreferredSize(new java.awt.Dimension(82, 31));
        btnconsultar.setRequestFocusEnabled(false);
        getContentPane().add(btnconsultar);
        btnconsultar.setBounds(250, 400, 130, 50);

        btnatualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnatualizar.setForeground(new java.awt.Color(255, 102, 0));
        btnatualizar.setText("ATUALIZAR");
        btnatualizar.setPreferredSize(new java.awt.Dimension(82, 31));
        btnatualizar.setRequestFocusEnabled(false);
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnatualizar);
        btnatualizar.setBounds(430, 400, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(811, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
 //1 - Perguntar se tem certeza que deseja excluir
        int resposta; // 0 - Sim; 1 - Não 
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        //1.1 - Se a responta for sim
        if (resposta == 0) { //Resposta SIM
            //1.1.1 Obter o usuário no txtUsuario.
            String u = txtcodigoProduto.getText();
            //1.1.2 - Conectar com o banco de dados.
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdorcamentogerais", "root", "Skyline2");
                //1.1.3 - Excluir o usuário do banco de dados.
                PreparedStatement st = conectado.prepareStatement("DELETE FROM produtos WHERE codigoproduto = ?");
                st.setString(1, u);
                st.executeUpdate(); //INSERT, UPDATE, DELETE
                //1.1.4 Mostrar a mensagem "Usuário excluído com sucesso" e limpar os campos.
                JOptionPane.showMessageDialog(null, "Produto excluído com sucesso");
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
    }//GEN-LAST:event_btndeletarActionPerformed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        String c, d, q, p, v;
        c = txtcodigoProduto.getText();
        d = txtdescricaoProduto.getText();
        q = txtqtde.getText();
        p = txtprecoUnitario.getText();
        v = txtprecoVenda.getText();

        // 3 - Conectar com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //4 - Inserir dados coletados no formulario para o BD
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produtos VALUES (?,?,?,?,?)");
            st.setString(1, c);
            st.setString(2, d);
            st.setString(3, q);
            st.setString(4, p);
            st.setString(5, v);

            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso");
            // 4- Limpar os campos
            txtcodigoProduto.setText(" ");
            txtdescricaoProduto.setText(" ");
            txtqtde.setText(" ");
            txtprecoUnitario.setText("");
            txtprecoVenda.setText("");
            txtcodigoProduto.requestFocus();

            //5 - Desconectar do BD
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro" + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtcodigoProduto.requestFocus();
            }

        }

    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
      //1 - Pegar as informações dos campos do formulário.
        String c, d, q ,p, v;
        c = txtcodigoProduto.getText();
        d = txtdescricaoProduto.getText();
        q = txtqtde.getText();
        p = txtprecoUnitario.getText();
        v = txtprecoVenda.getText();
        
        //2 - Verificar se os campos txtcodigoProduto.
        if (c.isEmpty()) { // se Codigo produto está vazio
            JOptionPane.showMessageDialog(null, "É obrigatório digitar o Código do Produto");
            txtcodigoProduto.requestFocus();
            return; // stop
        }
        //3 - Conectar com o banco de dados.
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //4 - Inserir os dados digitados, na tabela do banco de dados.
            PreparedStatement st = conectado.prepareStatement("UPDATE produtos SET descricaoproduto = ?, qtde = ?, precounitario = ?, precovenda = ? WHERE codigoproduto = ?");
            st.setString(1, d);
            st.setString(2, q);
            st.setString(3, p);
            st.setString(4, v);
            st.setString(5, c);
            st.executeUpdate();
            //4.1 Mostrar a mensagem "Usuário alterado com sucesso" e limpar os campos.
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            //5.0 Desconectar do banco de dados
            conectado.close();
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro:" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnatualizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btndeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcodigoProduto;
    private javax.swing.JLabel lbldescricaoProduto;
    private javax.swing.JLabel lblprecoUnitario;
    private javax.swing.JLabel lblprecoVenda;
    private javax.swing.JLabel lblqtde;
    private javax.swing.JTextField txtcodigoProduto;
    private javax.swing.JTextField txtdescricaoProduto;
    private javax.swing.JTextField txtprecoUnitario;
    private javax.swing.JTextField txtprecoVenda;
    private javax.swing.JTextField txtqtde;
    // End of variables declaration//GEN-END:variables
}
