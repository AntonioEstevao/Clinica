/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;
import modeloBeans.BeansUsuario;
import modeloConection.ConexaoBD;


public class DaoUsuario {
    
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    
    public void Salvar (BeansUsuario mod){
        try {
            conex.conexao();
            PreparedStatement pst = conex.con.prepareStatement(" insert into usuarios ( nome_usu,tipo, senha) values (?,?,?) " );
            pst.setString(1,mod.getUsuNome());
            pst.setString(3,mod.getUsuTipo());
            pst.setString(2,mod.getUsuSenha());
          
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados"+ex);
        }
    
    }
    
      public BeansUsuario buscaUsuario (BeansUsuario mod){
            conex.conexao();
            conex.executaSql(" select * from usuarios where nome_usu like '%"+mod.getPesquisa()+"%' ");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("cod_usu"));
            mod.setUsuNome(conex.rs.getString("nome_usu"));
            mod.setUsuTipo(conex.rs.getString("tipo"));
            mod.setUsuSenha(conex.rs.getString("senha"));
          
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null," Medico não cadastrado "+ex);    
        }
            return mod;
    
}  
    
    public void Editar (BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(" update usuarios set nome_usu=?, senha=?, tipo=? where cod_usu=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao alterar dados"+ex);
        }
}
   
}







    

