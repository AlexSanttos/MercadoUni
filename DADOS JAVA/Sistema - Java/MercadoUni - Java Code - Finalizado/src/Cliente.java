import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Cliente extends javax.swing.JFrame {

    
    public Cliente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCliente = new javax.swing.JMenu();
        itmIncluir = new javax.swing.JMenuItem();
        itmEditar = new javax.swing.JMenuItem();
        itmExcluir = new javax.swing.JMenuItem();
        itmListar = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 0));

        mnuCliente.setText("Cliente");

        itmIncluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmIncluir.setText("Incluir Contrato");
        itmIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIncluirActionPerformed(evt);
            }
        });
        mnuCliente.add(itmIncluir);

        itmEditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmEditar.setText("Editar Contrato");
        itmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarActionPerformed(evt);
            }
        });
        mnuCliente.add(itmEditar);

        itmExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluir.setText("Excluir Contrato");
        itmExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirActionPerformed(evt);
            }
        });
        mnuCliente.add(itmExcluir);

        itmListar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmListar.setText("Listar Contratos");
        itmListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarActionPerformed(evt);
            }
        });
        mnuCliente.add(itmListar);

        jMenuBar1.add(mnuCliente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(809, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIncluirActionPerformed
        TelaCliente tela;
        tela = new TelaCliente();
        tela.setVisible(true);
    }//GEN-LAST:event_itmIncluirActionPerformed

    private void itmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarActionPerformed
        abrirTelaCliente ("alterar");
    }//GEN-LAST:event_itmEditarActionPerformed

    private void itmExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirActionPerformed
        abrirTelaCliente("excluir");
    }//GEN-LAST:event_itmExcluirActionPerformed

    private void itmListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarActionPerformed
        new ListaContratos().setVisible(true);
    }//GEN-LAST:event_itmListarActionPerformed

    private void abrirTelaCliente(String operacao){
          // 1 - Solicitar o cliente a ser excluído
        String u;
        u = JOptionPane.showInputDialog(null,"Digite o Cliente a " + operacao,"Cliente",1);
        if( u == null){
            return;//stop
        }   
          try {
            //2 - Conectar no banco de dados mercadouni;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercadouni", "root", "Skyline2");
            //3 - Buscar o usuário digitado na tabela usuario do banco de dados sistembd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM cliente WHERE contrato = ?");
            st.setString(1, u);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                //Pega o nome e o cargo que veio na consulta ao banco de dados
                String  NomeCliente, CNPJ, nome, numero;
                NomeCliente = resultado.getString("Contrato");
               CNPJ = resultado.getString("CNPJ");
                nome = resultado.getString("Nome");
                numero = resultado.getString("Telefone");
                //Abrir o formulário Menu.java
                TelaCliente tela;
                tela  = new TelaCliente( NomeCliente, CNPJ, nome, numero,operacao);
                tela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não cadastrado");
            }
            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmEditar;
    private javax.swing.JMenuItem itmExcluir;
    private javax.swing.JMenuItem itmIncluir;
    private javax.swing.JMenuItem itmListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuCliente;
    // End of variables declaration//GEN-END:variables
}
