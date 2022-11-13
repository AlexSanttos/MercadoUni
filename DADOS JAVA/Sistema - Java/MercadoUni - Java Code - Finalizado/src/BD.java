

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class BD {
    
    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;
    private final String url = "jdbc:mysql://localhost:3306/dadoscadastrais";
    private final String user = "root";
    private final String senha = "Skyline2";

    //Conectar com o banco de dados
    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection(url, user, senha);
    }
    public ResultSet contratos(String u) throws ClassNotFoundException, SQLException{
        conectar();
        st = conectado.prepareStatement("SELECT * FROM financas WHERE EMPRESA = ?");
        st.setString(1, u);
        resultado = st.executeQuery();
        return resultado;
    }
    public void selecionarConta(String a,String u,String b,String x,String n) throws ClassNotFoundException, SQLException{
       conectar();
       st = conectado.prepareStatement("UPDATE financas SET CONTA = ?,VALORCONTRATO = ?, PAGO = ?, DESTINADO = ? WHERE EMPRESA = ?");
            st.setString(1, a);
            st.setString(2, u);
            st.setString(3, b);
            st.setString(4, x);
            st.setString(5, n);
            st.executeUpdate();

    }
    
}

    
