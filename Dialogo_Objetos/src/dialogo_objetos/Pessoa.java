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
public class Pessoa {
    
    private String Nome;
    private String Sentimento;
    private String NomeAmigo;
    
    
    //Nome da pessoa
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }
    
    //sentimento da Pessoa
    public String getSentimento(){
        return Sentimento;
    }
    public void setSentimento(String sentimento){
        Sentimento=sentimento;
    }
    
    //nome do amigo 
    public String getNomeAmigo(){
        return NomeAmigo;
    }
    
    public void setNomeAmigo(String nomeamigo){
        NomeAmigo = nomeamigo;
    }
    
    //Para sempre informar o nome e o sentimento quando for criar a pessoa
    
    public Pessoa(String nome, String sentimento, String nomeamigo){
        setNome(nome);
        setSentimento(sentimento);
        setNomeAmigo(nomeamigo);
        setApelido(nomeamigo);
        
    }
    
    // oque toda pessoa faz? cumprimenta a outra
    
    public void Cumprimentar(){
        System.out.println("Olá " + getNomeAmigo()+ " !");
    }
    
    // apresentação
    
    public void Apresentar(){
        System.out.println("eu estou me sentindo "+getSentimento()+" e você?");
    }
    
    // despedida 
    
     private String Apelido;
    public String getApelido()
    {
        return Apelido;
    }
    public void setApelido(String nomeamigo){
       
        Apelido = nomeamigo.substring(0,nomeamigo.length()-2)+ "ão";
    }
    
    public void Despedirse(){
        System.out.println("Até mais "+getApelido()+" , a gente se vê! Abraço!");
    }
}
