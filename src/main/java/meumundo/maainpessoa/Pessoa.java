package meumundo.maainpessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RTX4060
 */
public class Pessoa {
   private String nome ="joao";
   private int idade;
   private double altura;
   private int idadeaparente;
    
    public String getNome (){
        return nome;
    }
       public void setNome(String nome){
               
        this.nome = nome;
    }
       public int getIdade(){
           return idade;
       }
       public void setIdade(int idade){
           this.idade=idade;
           
}
         public double getAltura(){
           return altura;
       }
       public void setAltura(double altura){
           this.altura=altura;
           
}
        public int getIdadeaparente(){
           return idadeaparente;
       }
       public void setIdadeaparente(int idadeaparente){
           this.idadeaparente=idadeaparente;
           
}


    
}
