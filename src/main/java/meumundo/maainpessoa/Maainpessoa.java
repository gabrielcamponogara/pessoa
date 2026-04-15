/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package meumundo.maainpessoa;

import javax.swing.JOptionPane;

/**
 *
 * @author RTX4060
 */
public class Maainpessoa {

    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa();
       pessoa.setNome("PADERO");
       pessoa.setAltura(1.80);
       pessoa.setIdade(56);
       pessoa.setIdadeaparente(105);
        
               JOptionPane.showMessageDialog(null,"o seu nome é"+ pessoa.getNome()); 
                JOptionPane.showMessageDialog(null,"a idade de PADERO é"+ pessoa.getIdade ()); 
                  JOptionPane.showMessageDialog(null,"a altura é" + pessoa.getAltura()); 
                  JOptionPane.showMessageDialog(null,"porém sua idade aparente é" + pessoa.getIdadeaparente()); 
    }
   
}
