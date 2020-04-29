package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dedea
 */
public class CadastroTableModel extends AbstractTableModel{
   
    
    private List<Cadastro> dados = new ArrayList<>();
    private String[] colunas = {"Nome","Endereço","Cpf","Telefone","Animal","Raça","Tipo"};

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
                return dados.get(linha).getNome();
            case 1: 
                return dados.get(linha).getEndereco();
            case 2: 
                return dados.get(linha).getCpf();
            case 3: 
                return dados.get(linha).getTelefone();
            case 4: 
                return dados.get(linha).getNome_animal();
            case 5: 
                return dados.get(linha).getRaca();
            case 6: 
                return dados.get(linha).getTipo_ani();
        }
        
        return null;
        
    } 
   
    public void addRow(Cadastro c){
        this.dados.add(c);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    
    
    
    
}
