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
//        if (this.sistol <= 0 && this.diastol <= 0){
//        tk = "Tensi Tidak Terdeteksi";
//    } else if (this.sistol >= 90 && this.diastol <= 60){
//        tk = "Tensi Rendah";
//    } else if (this.sistol >= 91 && this.diastol <= 61){
//        tk = "Tensi Rendah";
//    } else if (this.sistol >= 92 && this.diastol <= 62){
//        tk = "Tensi Rendah";
//    } else if (this.sistol >= 93 && this.diastol <= 63) {
//        tk = "Tensi Rendah";
//    } else if (this.sistol >= 94 && this.diastol <= 64){
//        tk = "Tensi Rendah";
//    } else if (this.sistol >= 95 && this.diastol <= 65){
//            tk = "Tensi Rendah";
//        }  else if (this.sistol >= 96 && this.diastol <= 66){
//            tk = "Tensi Rendah";
//        } else if  ()
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
