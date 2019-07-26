
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {
   
  public  Statement stm;
  public  ResultSet rs;
  private String driver = "com.mysql.jdbc.Driver";
  private String caminho = "jdbc:mysql://localhost:3306/clinica";
  private String usuario= "root";
  private String senha = "";
  public  Connection con;
  
    public void conexao () {
    try {
           Class.forName(driver);
           con = DriverManager.getConnection(caminho, usuario, senha);
          // JOptionPane.showMessageDialog(null,"ATENÇÃO:\n CONETADO COM SUCESSO!!");
          // return con;
       
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Atenção: erro na conecão" +e);
           // return null;
    
    
    
    }
  
}
    public void executaSql(String sql){
    
      try {
          stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
          rs = stm.executeQuery(sql);
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"Atenção: erro execute sql" +ex);
      }
    
    
    
    
    
    
    }
    
}