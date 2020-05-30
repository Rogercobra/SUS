package com.mycompany.sosus;

import java.util.Random;

/**
 *
 * @author Ghost
 */
public class CadastroSOSus {
   private String endereco;
   private int telefone;
   private int cartãoSus;
    

//Mtodos publicos
public void Id (){
Random gerador = new Random();

for (int i = 0; i < 1; i++) {
     System.out.println("ID:" + gerador.nextInt()); 
   
    }
}
//Mtodos Construtores

    public CadastroSOSus(String endereco, int telefone, int cartãoSus) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.cartãoSus = cartãoSus;
    }

//get & set

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCartãoSus() {
        return cartãoSus;
    }

    public void setCartãoSus(int cartãoSus) {
        this.cartãoSus = cartãoSus;
    }






}