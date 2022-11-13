
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaUsuario extends javax.swing.JFrame {

    // Construtor da Classe, chamado pelo newListaUsuarios
    public ListaUsuario() {
        initComponents();
        //carregamento da tabela
        preencherTabela();

    }

    private void preencherTabela() {
        try {

            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario ORDER BY nome DESC ");
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
//fazer até chgar no final da tabela

            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
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
        tblUsuarios = new javax.swing.JTable();
        lblcargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Lista de Usuarios");
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Senha", "Nome", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 60, 730, 420);

        lblcargo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcargo.setForeground(new java.awt.Color(255, 102, 0));
        lblcargo.setText("Cargo");
        getContentPane().add(lblcargo);
        lblcargo.setBounds(40, 10, 100, 40);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Todos", "Diretor", "Compradora Orçamentária", "Programador", "DBA", "Diretor de TI" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(90, 20, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, 0, 800, 500);

        setSize(new java.awt.Dimension(816, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        String c;
        c = cmbCargo.getSelectedItem().toString();
        if (c.equalsIgnoreCase("Ver Todos")) {
            preencherTabela();
            return; //parar
        }
        try {

            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //2 - Buscar todos os usuários pelo cargo selecionado
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WHERE cargo = ?");
            st.setString(1, c);
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
//fazer até chgar no final da tabela
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }

            //4 - Desconectar do banco de dados
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCargoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcargo;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
