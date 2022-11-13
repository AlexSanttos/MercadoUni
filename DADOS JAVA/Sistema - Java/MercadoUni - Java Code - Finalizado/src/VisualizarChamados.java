import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisualizarChamados extends javax.swing.JFrame {

    
    public VisualizarChamados() {
        initComponents();
                VisualizarChamados();

    }

    private void VisualizarChamados() {
        try {
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamadosti", "root", "Skyline2");

            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM chamados ORDER BY nome DESC");
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblVisualizar
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblVisualizar.getModel();
            //fazer até chegar no final da tabela (enquanto tiver próximo usuário)
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("nome"),
                    resultado.getString("cargo"),
                    resultado.getString("data"),
                    resultado.getString("descrição")
                };
                tblModelo.addRow(dados);
            }
            //4 - Desconectar do banco de dados       
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisualizar = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDigite = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        tblVisualizar.setBackground(new java.awt.Color(204, 204, 204));
        tblVisualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "Data", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVisualizar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 630, 300);

        btnExcluir.setBackground(new java.awt.Color(204, 204, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 51, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(280, 440, 72, 22);

        lblNome.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 51, 0));
        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(40, 380, 70, 30);

        txtNome.setBackground(new java.awt.Color(204, 204, 204));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 380, 220, 30);

        lblDigite.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        lblDigite.setForeground(new java.awt.Color(255, 51, 0));
        lblDigite.setText("Digite o nome do chamado que deseja excluir:");
        getContentPane().add(lblDigite);
        lblDigite.setBounds(20, 330, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 500);

        setSize(new java.awt.Dimension(678, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        //1 - Perguntar se tem certeza que deseja excluir
        int resposta; // 0 - Sim; 1 - Não
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        //1.1 - Se a responta for sim
        if (resposta == 0) { //Resposta SIM
            //1.1.1 Obter o usuário no txtUsuario.
            String u = txtNome.getText();
            //1.1.2 - Conectar com o banco de dados.
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/chamadosti", "root", "admin");
                //1.1.3 - Excluir o usuário do banco de dados.
                PreparedStatement st = conectado.prepareStatement("DELETE FROM chamados WHERE nome = ?");
                st.setString(1, u);
                st.executeUpdate(); //INSERT, UPDATE, DELETE
                //1.1.4 Mostrar a mensagem "Usuário excluído com sucesso" e limpar os campos.
                JOptionPane.showMessageDialog(null, "Chamado excluído com sucesso");
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

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarChamados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarChamados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDigite;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblVisualizar;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
