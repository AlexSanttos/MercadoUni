

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuFinancas extends javax.swing.JFrame {

    public MenuFinancas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFinancas = new javax.swing.JMenu();
        itmContratos = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 790, 520);

        jMenuFinancas.setText("FINANÇAS");

        itmContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money-bag (1).png"))); // NOI18N
        itmContratos.setText("Contratos");
        itmContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContratosActionPerformed(evt);
            }
        });
        jMenuFinancas.add(itmContratos);

        jMenuBar1.add(jMenuFinancas);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(806, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContratosActionPerformed
        String u;
        u = JOptionPane.showInputDialog(null, "Digite o da empresa da empresa desejada", "Caixa Acesso", 1);
        if (u == null){
        return;
        }
       
        try {
            BD financasBD = new BD();
            ResultSet resultado = financasBD.contratos(u);
            //4- Verificar se o usuário foi encontrado na tabela usuário do banco de dados.
            if (resultado.next()) {//se ele encontrou
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                //nas "" nome dos campos da tabela
                String emp, cnpj, ce, valor, cd;
                emp = resultado.getString("EMPRESA");
                cnpj = resultado.getString("CNPJ");
                ce = resultado.getString("CONTRATOEXPIRA");
                valor = resultado.getString("VALORCONTRATO");
                cd = resultado.getString("DESTINADO");

                DadosContratuais tela = new DadosContratuais(emp, cnpj, ce, valor, cd);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Empresa não Existe");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_itmContratosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFinancas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFinancas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmContratos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFinancas;
    // End of variables declaration//GEN-END:variables
}
