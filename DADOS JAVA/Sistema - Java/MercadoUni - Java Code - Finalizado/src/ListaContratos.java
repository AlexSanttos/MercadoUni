
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaContratos extends javax.swing.JFrame {

    
    public ListaContratos() {
        initComponents();
        preencherTabela();
        
    }

    private void preencherTabela() {

        try {
            // 1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadouni", "root", "Skyline2");
            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM cliente ORDER BY Nome DESC");
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblCliente.getModel()  ;
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("Contrato"),
                    resultado.getString("CNPJ"),
                    resultado.getString("Nome"),
                    resultado.getString("Telefone"),};
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
        tblCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "CNPJ", "Nome do Responsável", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 16, 626, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 390);

        setSize(new java.awt.Dimension(654, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
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
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
