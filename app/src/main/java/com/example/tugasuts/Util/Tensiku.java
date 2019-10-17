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
        if (this.sistol >= 80 && this.sistol <= 100 || this.diastol >= 50 && this.diastol <= 79 ){
            tk = "Tensi Rendah";
        } else if (this.sistol >= 101 && this.sistol <= 135 || this.diastol >= 80 && this.diastol <= 90){
            tk = "Tensi Normal";
        } else if (this.sistol >= 136 && this.sistol <= 240 || this.diastol >= 100 && this.diastol <= 100){
            tk = "Tensi Tinggi";
        }else  {
            tk = "Tensi Tidak Tedeteksi";
        }
        return tk;
}
}
