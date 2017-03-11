/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

/**
 *
 * @author AXIOO NEON HNM SE
 */
public class tugasAkhir {
    String judul;
    String tahun;
    Dosen[] pembimbing;
    
    public tugasAkhir(){
        this.judul = " ";
        this.tahun = " ";
    }
    
    public tugasAkhir(String judul, String tahun){
        this.judul = judul;
        this.tahun = tahun;
        
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setPembimbing(Dosen[] pembimbing) {
        this.pembimbing = pembimbing;
    }
    
    
}
