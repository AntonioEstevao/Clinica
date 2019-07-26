/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansMedico;

/**
 *
 * @author TONELSON ESTEVÃO
 */
public class DaoMedico {
    ConexaoBD conex = new ConexaoBD();
    BeansMedico mod = new BeansMedico();
    
    public void Salvar (BeansMedico mod){
        try {
            conex.conexao();
            PreparedStatement pst = conex.con.prepareStatement(" insert into medicos ( nome_med, especialidade_med,crm) values (?,?,?)  ");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3,mod.getCrm());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados inserido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir dados"+ex);
        }
    
    }
    
    public void Editar (BeansMedico mod){
           conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement(" update medicos set nome_med=?, especialidade_med=?, crm=? where cod_med=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setInt(3, mod.getCrm());
            pst.setInt(4, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao alterar dados"+ex);
        }
    
    
    }
    
     public void Excluir (BeansMedico mod){
     conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement(" delete from medicos where cod_med=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados excluido com sucesso");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao excluir dados"+ex);
        }
     }
     
     public BeansMedico buscaMedico (BeansMedico mod){
            conex.conexao();
            conex.executaSql(" select * from medicos where nome_med like '%"+ mod.getPesquisa()+"%' ");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_med"));
            mod.setNome(conex.rs.getString("nome_med"));
            mod.setEspecialidade(conex.rs.getString("especialidade_med"));
            mod.setCrm(conex.rs.getInt("crm"));
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null," Medico não cadastrado "+ex);    
        }
            return mod;
    
}  
}
