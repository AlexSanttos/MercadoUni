
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaProdutos extends javax.swing.JFrame {

    public ListaProdutos() {
        try {
            initComponents();
            //carregamento da tabela
            preencherTabela();
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "Skyline2");
            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produtos ORDER BY codigoProduto DESC ");
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblListaProdutos.getModel();
//fazer até chgar no final da tabela
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("codigoproduto"),
                    resultado.getString("descricaoproduto"),
                    resultado.getString("qtde"),
                    resultado.getString("precounitario"),
                    resultado.getString("precovenda")
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

    private void preencherTabela() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Lista Produtos");
        getContentPane().setLayout(null);

        tblListaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Produto", "Descrição Produto", "Quantidade", "Preço Unitário", "Preço Venda"
            }
        ));
        jScrollPane2.setViewportView(tblListaProdutos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 30, 700, 402);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fundo Mercado Uni.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 500);

        setSize(new java.awt.Dimension(812, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblListaProdutos;
    // End of variables declaration//GEN-END:variables
}
