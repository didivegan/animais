/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/** 
 *
 * @author dedea
 */
public class EstoqueTableModel extends AbstractTableModel {
    
    private List<Estoque> dados = new ArrayList<>();
    private String[] colunas = {"Código","Descrição","Valor"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna) {
            case 0:
                return dados.get(linha).getCodigo();
            case 1: 
                return dados.get(linha).getDescricao();
            case 2: 
                return dados.get(linha).getValor();
            
        }
        
        return null;
        
    } 
   
    public void addRow(Estoque e){
        this.dados.add(e);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}


