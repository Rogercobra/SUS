
package com.mycompany.sosus;

import java.util.Date;


/**
 *
 * @author Ghost
 */
class Usuario {
    // Atributos
   private String nome;
   private int Cpf;
   private int dataNascimento;
   public int Cadastro; 
  
    // Mtodos Publicos
   public void status(){
    
     
      
   }
//Metodos especiais Construtor

    public Usuario(String nome, int Cpf, int dataNascimento, int Cadastro) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.dataNascimento = dataNascimento;
        this.Cadastro = Cadastro;
        
    }
//get&set

    public String getNome() {
    
        return nome;
    }

    public void setNome(String nome) {
       
        this.nome = nome;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getCadastro() {
        return Cadastro;
    }

    public void setCadastro(int Cadastro) {
        this.Cadastro = Cadastro;
    }  
}

