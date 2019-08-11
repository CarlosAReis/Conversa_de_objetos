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
public class Extrovertido extends Pessoa{
    
    public Extrovertido(String nome, String sentimento, String nomeamigo) {
        super(nome, sentimento, nomeamigo);
        setApelido(nomeamigo);
        
    }
    private String Apelido;
    public String getApelido()
    {
        return Apelido;
    }
    public void setApelido(String nomeamigo){
       
        Apelido = nomeamigo+ "zito";
    }
    @Override
     public void Cumprimentar(){
         String frase = "Eai "+ getNomeAmigo()+" beleza campeão?!";
        System.out.println(frase.toUpperCase());
    }
     
     @Override
      public void Apresentar(){
        System.out.println(("Ah Cara eu to "+getSentimento()+"!!").toUpperCase());
    }
      
    @Override
     public void Despedirse(){
        System.out.println(("Falou "+getApelido()+" , Abração mano! até a proxima!").toUpperCase());
    }
}
