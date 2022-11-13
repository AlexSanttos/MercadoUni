
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RelatorioLucros extends javax.swing.JFrame {

  
    public RelatorioLucros() {
        initComponents();
        preencherTabela();
    }

    private void preencherTabela() {

        try {
            //não retornar valor
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdorcamentogerais", "root", "Skyline2");
            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM orçamentovendas ORDER BY NomeProduto ");
            ResultSet resultado = st.executeQuery();
            //3 - Carregar os usuários na tabela tblUsuarios
            DefaultTableModel tblModelo; // criar um MODELO da tabela
            tblModelo = (DefaultTableModel) tblLucro.getModel(); //Colocou a tabela no MODELO
            tblModelo.setRowCount(0);

            while (resultado.next()) { //Até chegar no final (WHILE)
                //Tipo OBJECT aceita todo tipo de valor (inteiro, float, string...)
                Object dados[] = {
                    resultado.getString("IDProduto"),
                    resultado.getString("NomeProduto"),
                    resultado.getString("RendimentoTotal"),
                    resultado.getString("QtdVendido"),
                    resultado.getString("QtdEstoque")
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

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLucro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLucro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Produto", "Nome Produto", "Redimento Total", "Qtd Vendido", "Qtd Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLucro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

   
 

    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLucro;
    // End of variables declaration                   
}
