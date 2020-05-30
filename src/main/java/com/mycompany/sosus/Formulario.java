
package com.mycompany.sosus;

public class Formulario {
    
    private int Nfilhos;
    private String TDoenca;
    private String Remedio;
    private int    Pressao;
    private float  tempC;
    
    //Mtodos privado
    
    private void Consulta(){
    
    
    
    }
    
    //Mconstrutor

    public Formulario(int Nfilhos, String TDoenca, String Remedio, int Pressao, float tempC) {
        this.Nfilhos = Nfilhos;
        this.TDoenca = TDoenca;
        this.Remedio = Remedio;
        this.Pressao = Pressao;
        this.tempC = tempC;
    }
    //get & set

    public int getNfilhos() {
        return Nfilhos;
    }

    public void setNfilhos(int Nfilhos) {
        this.Nfilhos = Nfilhos;
    }

    public String getTDoenca() {
        return TDoenca;
    }

    public void setTDoenca(String TDoenca) {
        this.TDoenca = TDoenca;
    }

    public String getRemedio() {
        return Remedio;
    }

    public void setRemedio(String Remedio) {
        this.Remedio = Remedio;
    }

    public int getPressao() {
        return Pressao;
    }

    public void setPressao(int Pressao) {
        this.Pressao = Pressao;
    }

    public float getTempC() {
        return tempC;
    }

    public void setTempC(float tempC) {
        this.tempC = tempC;
    }
    
    
    
    
}
