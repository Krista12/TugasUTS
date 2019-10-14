package com.example.tugasuts.Util;

public class Tensiku{
    private int sistol;
    private int diastol;
    private String tk;

    public Tensiku (int sistol, int diastol){
        this.sistol = sistol;
        this.diastol = diastol;
        this.tk = Tekanan();
    }

    public String Tekanan(){
        if (this.sistol <= 100 && this.diastol <= 80){
            tk = "Tensi Rendah";
        } else if (this.sistol >= 100 && this.diastol <= 90){
            tk = "Tensi Normal";
        } else if (this.sistol >= 130 && this.diastol >= 100){
            tk = "Tensi Tinggi";
        }
        return tk;
    }
}
