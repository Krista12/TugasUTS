package com.example.tugasuts.Util;

public class Tensiku{
    private int sistol;
    private int diastol;

    public Tensiku (int sistol, int diastol){
        this.sistol = sistol;
        this.diastol = diastol;
    }

    public int Tekanan(){
        String tekanan = "";
        if (this.sistol <= 100 && this.diastol <= 80){
            tekanan = "Tensi Rendah";
        } else if (this.sistol >= 100 && this.diastol <= 90){
            tekanan = "Tensi Normal";
        } else if (this.sistol >= 130 && this.diastol >= 100){
            tekanan = "Tensi Tinggi";
        }
        return Integer.parseInt(tekanan);
    }
}
