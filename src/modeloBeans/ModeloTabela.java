/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author TONELSON ESTEVÃO
 */
public class ModeloTabela extends AbstractTableModel {
 
        private ArrayList linha = null;
        private String []  coluna = null;
        
   public  ModeloTabela ( ArrayList lin , String[] col) {
   
       setLinha(lin);
       setColuna (col);
   
   
   }    

    /**
     * @return the linha
     */
    public ArrayList getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(ArrayList linha) {
        this.linha = linha;
    }

    /**
     * @return the coluna
     */
    public String[] getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(String[] coluna) {
        this.coluna = coluna;
    }
    
    public int getColumnCount () {
           return coluna.length;
    } 
    public int getRowCount () {
           return linha.size();
    }
    public String getColumnName(int numCol){
            return coluna[numCol];
    }
     public Object getValueAt (int numLin , int numCol){
           Object [] linha = (Object[]) getLinha().get(numLin);
            return linha [numCol]; 
     
     }
}
