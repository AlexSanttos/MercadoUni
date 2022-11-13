import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaOrcamentoGerais extends javax.swing.JFrame {

   
    public TelaOrcamentoGerais() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRelatorioLucros = new javax.swing.JButton();
        btnRelatorioProjeto = new javax.swing.JButton();
        btnRelatorioGeral = new javax.swing.JButton();
        txtLucro = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRelatorioFuncionario = new javax.swing.JButton();

        btnRelatorioLucros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorioLucros.setForeground(new java.awt.Color(255, 51, 0));
        btnRelatorioLucros.setText("Relatório Lucros");
        btnRelatorioLucros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioLucrosActionPerformed(evt);
            }
        });

        btnRelatorioProjeto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorioProjeto.setForeground(new java.awt.Color(255, 51, 0));
        btnRelatorioProjeto.setText("Relatório Projetos");
        btnRelatorioProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioProjetoActionPerformed(evt);
            }
        });

        btnRelatorioGeral.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorioGeral.setForeground(new java.awt.Color(255, 51, 0));
        btnRelatorioGeral.setText("Calcular Orçamento ");
        btnRelatorioGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioGeralActionPerformed(evt);
            }
        });

        txtLucro.setEditable(false);
        txtLucro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCusto.setEditable(false);
        txtCusto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Custo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lucro");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnRelatorioFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorioFuncionario.setForeground(new java.awt.Color(255, 51, 0));
        btnRelatorioFuncionario.setText("Relatório Funcionários");
        btnRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRelatorioProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRelatorioLucros, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(btnRelatorioGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnRelatorioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnRelatorioProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnRelatorioLucros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addComponent(btnRelatorioGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnRelatorioLucrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioLucrosActionPerformed
        new RelatorioLucros().setVisible(true);
    }//GEN-LAST:event_btnRelatorioLucrosActionPerformed

    private void btnRelatorioProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioProjetoActionPerformed
        new RelatorioProjeto().setVisible(true);
    }//GEN-LAST:event_btnRelatorioProjetoActionPerformed

    private void btnRelatorioGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioGeralActionPerformed

        try {
            // Select Projeto
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdorcamentogerais", "root", "josiel.11");

            PreparedStatement st = conectado.prepareStatement("SELECT SUM(Orçamento) FROM orçamentoprojeto ");
            ResultSet resultado = st.executeQuery();
            int p = 0;
            if(resultado.next()){
                p = resultado.getInt("SUM(Orçamento)");
            }
            conectado.close();

            // Select Lucro Vendas
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectadoL = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdorcamentogerais", "root", "josiel.11");

            PreparedStatement SOL = conectadoL.prepareStatement("SELECT SUM(RendimentoTotal) FROM orçamentoVendas");
            ResultSet resultadoL = SOL.executeQuery();
            if(resultadoL.next()){
                String l = resultadoL.getString("SUM(RendimentoTotal)");
                txtLucro.setText(l);
            }

            conectado.close();
            //Select Sálario

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectadoF = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdorcamentogerais", "root", "josiel.11");

            PreparedStatement sof = conectadoF.prepareStatement("SELECT SUM(Sálario) FROM orçamentofuncionarios");
            ResultSet resultadoF = sof.executeQuery();
            int f;
            if(resultadoF.next()){
                f = resultadoF.getInt("SUM(Sálario)");

                int r = f + p;

                txtCusto.setText(String.valueOf(r));

            }

            conectado.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnRelatorioGeralActionPerformed

    private void btnRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioFuncionarioActionPerformed
        new RelatorioFuncionarios().setVisible(true);
    }//GEN-LAST:event_btnRelatorioFuncionarioActionPerformed
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamentoGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamentoGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamentoGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrcamentoGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrcamentoGerais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorioFuncionario;
    private javax.swing.JButton btnRelatorioGeral;
    private javax.swing.JButton btnRelatorioLucros;
    private javax.swing.JButton btnRelatorioProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtLucro;
    // End of variables declaration//GEN-END:variables
}
