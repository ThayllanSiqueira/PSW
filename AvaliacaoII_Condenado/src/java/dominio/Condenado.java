/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

import java.io.Serializable;

/**
 *
 * @author rafa
 */
public class Condenado implements Serializable{
    
    private String Nome;
    
    private String Crime;
    
    private int Tempo_Prisao;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCrime() {
        return Crime;
    }

    public void setCrime(String Crime) {
        this.Crime = Crime;
    }

    public int getTempo_Prisao() {
        return Tempo_Prisao;
    }

    public void setTempo_Prisao(int Tempo_Prisao) {
        this.Tempo_Prisao = Tempo_Prisao;
    }
    
    public boolean persiste() {
        return false; 
    }
    
}
