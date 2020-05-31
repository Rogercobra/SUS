
package com.mycompany.sosus;
public class Administrativo {
   

    public String nomeAdm;
    private int Senha;

    public String getNomeAdm() {
        return nomeAdm;
    }

    public void setNomeAdm(String nomeAdm) {
        this.nomeAdm = nomeAdm;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int Senha) {
        this.Senha = Senha;
    }

    public Administrativo(String nomeAdm, int Senha) {
        this.nomeAdm = nomeAdm;
        this.Senha = Senha;
    }
 
    
    
    
    
    
    
    
}
