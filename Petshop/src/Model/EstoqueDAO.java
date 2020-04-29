/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author dedea
 */
public class EstoqueDAO {
    ArrayList <Estoque> vetores = new ArrayList();

    public void cadastraContato(Estoque e) {
        
        vetores.add(e); 
    }
}