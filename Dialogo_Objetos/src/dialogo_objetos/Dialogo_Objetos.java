/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo_objetos;

/**
 *
 * @author CarlosAugusto
 */
public class Dialogo_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa Caue = new Pessoa("Caue", "Bem", "Carlos");
        Extrovertido Carlos = new Extrovertido("Carlos", "Muito Feliz", "Caue");
        
        Caue.Cumprimentar();
        Carlos.Cumprimentar();
        Caue.Apresentar();
        Carlos.Apresentar();
        Caue.Despedirse();
        Carlos.Despedirse();
        
    }
    
}
